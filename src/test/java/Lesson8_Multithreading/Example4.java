package Lesson8_Multithreading;

public class Example4 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    System.out.println(i);
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1000; i >0 ; i--) {
                    System.out.println(i);
                }
            }
        }).start();
    }
}
