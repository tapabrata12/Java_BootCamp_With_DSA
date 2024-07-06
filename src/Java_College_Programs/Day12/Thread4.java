package Java_College_Programs.Day12;

class RunnableThreadExample {
    public static void main(String[] args) {
        // Create threads
        Thread thread1 = new Thread(new MyRunnable("Thread 1"));
        Thread thread2 = new Thread(new MyRunnable("Thread 2"));

        // Start threads
        thread1.start();
        thread2.start();
    }

    static class MyRunnable implements Runnable {
        private final String threadName;

        public MyRunnable(String name) {
            this.threadName = name;
        }

        public void run() {
            try {
                for (int i = 1; i <= 5; i++) {
                    System.out.println(threadName + ": " + i);
                    Thread.sleep(1000); // Sleep for 1 second
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

