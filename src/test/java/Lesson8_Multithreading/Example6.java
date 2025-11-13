package Lesson8_Multithreading;

public class Example6 {
//    static String  name = null;
    public static void main(String[] args) {
        MyThread6 myThread1 = new MyThread6();
        myThread1.setName("myThread1");
        myThread1.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Name of myThread1: " + myThread1.getName());
        System.out.println("Priority of myThread1: " + myThread1.getPriority());

        MyThread6 myThread2 = new MyThread6();
        myThread2.setName("myThread2");
        myThread2.setPriority(Thread.MIN_PRIORITY);
        System.out.println("Name of myThread2: " + myThread2.getName());
        System.out.println("Priority of myThread2: " + myThread2.getPriority());


    }
}
class MyThread6 extends Thread {
    @Override
    public void run(){
        System.out.println("Hello");
    }
}
