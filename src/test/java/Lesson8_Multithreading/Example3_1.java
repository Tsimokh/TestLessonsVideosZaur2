package Lesson8_Multithreading;

public class Example3_1 extends A_1 implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i < 1000; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Thread myThread1 = new Thread(new Example3_1());
        myThread1.start();
        for (int i = 1000; i > 0; i--) {
            System.out.println(i);
        }

    }
}

class A_1 {

}
