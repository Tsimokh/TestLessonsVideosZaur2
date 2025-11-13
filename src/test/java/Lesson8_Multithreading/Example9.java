package Lesson8_Multithreading;

import java.util.stream.Stream;

public class Example9 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+ " " + i);
        }
    }
    public static void main(String[] args) throws InterruptedException {

//        Thread thread1 = new Thread(()->{
//            for (int i = 1; i <= 10; i++) {
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println(Thread.currentThread().getName() + " " + i);
//            }
//        });
        Thread thread1 = new Thread(new MyRunnable());

        Example9 thread2 = new Example9();
        thread1.start();
//        Thread.sleep(3000);
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("The end!!!");


    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+ " " + i);
        }
    }
}
