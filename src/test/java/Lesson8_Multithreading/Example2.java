package Lesson8_Multithreading;

public class Example2 {
    public static void main(String[] args) {
        Thread myThread1 = new MyThread1();
        Thread myThread2 = new MyThread2();

//        Thread myThread1 = new Thread(new MyThread1());
//        Thread myThread2 = new Thread(new MyThread2());

        myThread1.start();
//        myThread1.abc1();
        myThread2.start();
//        myThread2.abc2();

    }
}


class MyThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.println(i);
        }
    }
//    public void abc1(){
//        System.out.println("abc1");
//    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        for (int i = 1000; i > 0; i--) {
            System.out.println(i);
        }
    }
//    public void abc2(){
//        System.out.println("abc2");
//    }
}
