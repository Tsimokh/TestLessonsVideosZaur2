package Lesson8_Multithreading;

public class Example10 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main begins");
        Thread thread = new Thread(new Worker());
        System.out.println(thread.getState());
        thread.start();
        System.out.println(thread.getState());
//            thread.join(4000);
        thread.join();
        System.out.println(thread.getState());
        System.out.println("Main ends");
    }
}

class Worker implements Runnable {
    @Override
    public void run() {
        System.out.println("Work begins");
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Work ends");
    }
}

