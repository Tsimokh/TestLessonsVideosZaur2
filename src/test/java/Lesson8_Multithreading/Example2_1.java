package Lesson8_Multithreading;

public class Example2_1 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Example2_1 myThread1 = new Example2_1();
        myThread1.start();

        for (int i = 1000; i > 0; i--) {
            System.out.println(i);
        }
    }
}

