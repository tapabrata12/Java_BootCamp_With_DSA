package Java_College_Programs.Day11;

class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread is running: " + i);
            try {
                Thread.sleep(1000); // Pause for 1 second
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class ImplementThread {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start(); // Start the thread

        // Main thread continues execution
        for (int i = 0; i < 5; i++) {
            System.out.println("Main thread is running: " + i);
            try {
                Thread.sleep(1000); // Pause for 1 second
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted");
            }
        }
    }
}

