package pattetns;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        //MyThread myThread = new MyThread();
        //myThread.start();

       // MyThread myThread2 = new MyThread();
        //myThread2.start();

        Thread thread = new Thread(new Runner());
        thread.start();
        System.out.println("Hello from main thread");
        //System.out.println("I'm going to sleep");
        //Thread.sleep(3000);
        //System.out.println("I woke up");
    }
}

class Runner implements Runnable {

    @Override
    public void run() {
        for(int i=0; i<1000; i++) {
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello from MyThread" + i);
        }
    }
}

class MyThread extends Thread {
    public void run() {
        for(int i=0; i<1000; i++) {
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello from MyThread" + i);
        }
    }
}