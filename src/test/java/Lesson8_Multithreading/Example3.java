package Lesson8_Multithreading;

public class Example3 {
    public static void main(String[] args) {
        Thread myThread1 = new Thread(new MyThread3());
        myThread1.start();

        Thread myThread2 = new Thread(new MyThread4());
        myThread2.start();
    }
}

class MyThread3 extends A implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i < 1000; i++) {
            System.out.println(i);
        }
    }
}

class MyThread4 extends A implements Runnable {
    @Override
    public void run() {
        for (int i = 1000; i > 0; i--) {
            System.out.println(i);
        }
    }
}

class A {

}
