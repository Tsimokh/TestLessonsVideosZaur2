package Lesson8_Multithreading;

public class Example7 implements Runnable {
    @Override
    public void run() {
        System.out.println("Method run. Thread name: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Example7());
//        thread.start();
        thread.run();
        System.out.println("Method main. Thread name: " + Thread.currentThread().getName());
//        Example7 example7 = new Example7();
//        example7.run();
    }
}

