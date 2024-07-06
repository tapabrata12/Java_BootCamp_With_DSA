package Java_College_Programs.Day12;

class ThreadPriorityExample {
    public static void main(String[] args) {
        // Create three threads
        Thread thread1 = new Thread(new MyRunnable(), "Thread 1");
        Thread thread2 = new Thread(new MyRunnable(), "Thread 2");
        Thread thread3 = new Thread(new MyRunnable(), "Thread 3");

        // Set priorities for the threads
        thread1.setPriority(Thread.MIN_PRIORITY); // Minimum priority (1)
        thread2.setPriority(Thread.NORM_PRIORITY); // Normal priority (5)
        thread3.setPriority(Thread.MAX_PRIORITY); // Maximum priority (10)

        // Start the threads
        thread1.start();
        thread2.start();
        thread3.start();
    }

    static class MyRunnable implements Runnable {
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
                try {
                    Thread.sleep(100); // Sleep for 100 milliseconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
