package Java_College_Programs.Day12;

class MyThread extends Thread {
    private volatile boolean running = true;

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
            Thread.yield(); // Yields control to another thread
        }
    }

    public void stopThread() {
        running = false; // Signals the thread to stop
    }
}

class ThreadDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        System.out.println("Starting Thread 1");
        t1.start();

        System.out.println("Starting Thread 2");
        t2.start();

        // Let Thread 1 run for a while
        try {
            Thread.sleep(2000); // Sleep for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Stop Thread 1
        System.out.println("Stopping Thread 1");
        t1.stopThread(); // Deprecated, but for demonstration

        // Let Thread 2 finish
        try {
            t2.join(); // Wait for Thread 2 to complete
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread exiting");
    }
}
