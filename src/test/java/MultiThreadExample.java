public class MultiThreadExample implements Runnable {
    private String threadName;

    MultiThreadExample(String name) {
        threadName = name;
    }

    public void run() {
        System.out.println(threadName + " running");
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(threadName + ", " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(threadName + " interrupted.");
        }
        System.out.println(threadName + " exiting.");
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new MultiThreadExample("Thread-1"));
        Thread t2 = new Thread(new MultiThreadExample("Thread-2"));

        t1.start();
        t2.start();
    }
}
