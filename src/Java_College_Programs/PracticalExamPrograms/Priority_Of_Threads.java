/*
Thread-3 with priority 10 is running
Thread-3 with priority 10 is running
Thread-3 with priority 10 is running
Thread-3 with priority 10 is running
Thread-3 with priority 10 is running
Thread-2 with priority 5 is running
Thread-2 with priority 5 is running
Thread-2 with priority 5 is running
Thread-2 with priority 5 is running
Thread-2 with priority 5 is running
Thread-1 with priority 1 is running
Thread-1 with priority 1 is running
Thread-1 with priority 1 is running
Thread-1 with priority 1 is running
Thread-1 with priority 1 is running
*/
package Java_College_Programs.PracticalExamPrograms;

class PriorityDemo extends Thread {
    public PriorityDemo(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " with priority " +
                    Thread.currentThread().getPriority() + " is running");
        }
    }

    public static void main(String[] args) {
        PriorityDemo t1 = new PriorityDemo("Thread-1");
        PriorityDemo t2 = new PriorityDemo("Thread-2");
        PriorityDemo t3 = new PriorityDemo("Thread-3");

        t1.setPriority(Thread.MIN_PRIORITY); // Set the priority to 1
        t2.setPriority(Thread.NORM_PRIORITY); // Set the priority to 5
        t3.setPriority(Thread.MAX_PRIORITY); // Set the priority to 10

        t1.start();
        t2.start();
        t3.start();
    }
}

