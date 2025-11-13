import java.io.File;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.Objects;

public class TestRunner {
    public static void main(String[] args) throws Exception {
        String testRootPackage = "runner"; // корінь з якого почати (поміняй під себе)
        String path = testRootPackage.replace('.', '/');

        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        URL resource = classLoader.getResource(path);

        if (resource == null) {
            System.err.println("❌ Package not found: " + path);
            return;
        }

        findAndRunTests(new File(resource.getFile()), testRootPackage);
    }

    private static void findAndRunTests(File directory, String packageName) {
        for (File file : Objects.requireNonNull(directory.listFiles())) {
            if (file.isDirectory()) {
                findAndRunTests(file, packageName + "." + file.getName());
            } else if (file.getName().endsWith(".class")) {
                String className = file.getName().replace(".class", "");
                try {
                    Class<?> clazz = Class.forName(packageName + "." + className);
                    Object instance = clazz.getDeclaredConstructor().newInstance();

                    for (Method method : clazz.getDeclaredMethods()) {
                        if (method.getName().startsWith("test") && method.getParameterCount() == 0) {
                            System.out.println("▶ Running: " + clazz.getName() + "." + method.getName());
                            try {
                                method.invoke(instance);
                            } catch (Throwable t) {
                                System.err.println("❌ Failed: " + t.getCause());
                            }
                        }
                    }

                } catch (Exception e) {
                    System.err.println("⚠️ Cannot run class " + className + ": " + e.getMessage());
                }
            }
        }
    }
}
