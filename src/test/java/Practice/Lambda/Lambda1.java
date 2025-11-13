package Practice.Lambda;


public class Lambda1 {
    int c = 40;

    public static void main(String[] args) {
        Math math = (a, b) -> a + b;
        System.out.println(math.doOperation(100, 3));
        System.out.println(((Math) (a, b) -> a + b).doOperation(3, 5));
    }

}

interface Math {
    int doOperation(int a, int b);
}
