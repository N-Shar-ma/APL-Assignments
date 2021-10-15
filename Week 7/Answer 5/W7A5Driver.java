public class W7A5Driver {
    public static void main(String[] args) throws InterruptedException {
        Object obj = new Object();
        Thread t1 = new Thread() {
            public void run() {
                System.out.println(Thread.currentThread().getName() + ": I'm going to sleep for 100ms");
                try {
                    sleep(100);
                } catch (InterruptedException e) {
                    System.out.println(Thread.currentThread().getName() + ": My sleep was interrupted! But I'll handle this exception");
                }
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                System.out.println(Thread.currentThread().getName() + ": I will wait for 200ms");
                try {
                    obj.wait(200);
                } catch (Exception e) {
                    System.out.println(Thread.currentThread().getName() + ": My wait was interrupted! But I'll handle this exception");
                }
            }
        };
        Thread t3 = new Thread() {
            public void run() {
                System.out.println(Thread.currentThread().getName() + ": Am I interrupted yet? " + Thread.interrupted() + " ... reset interruption status");
                System.out.println(Thread.currentThread().getName() + ": I do not sleep or wait");
            }
        };
        Thread t4 = new Thread() {
            public void run() throws RuntimeException {
                System.out.println(Thread.currentThread().getName() + ": I'm going to sleep for 300ms... Do not disturb!");
                try {
                    sleep(300);
                } catch (InterruptedException e) {
                    System.out.println(Thread.currentThread().getName() + ": My sleep was interrupted! I will NOT handle this exception!");
                    throw new RuntimeException("Thread interrupted in sleep");
                }
            }
        };
        t1.start();
        t1.interrupt();
        t2.start();
        t2.interrupt();
        t3.start();
        t3.interrupt();
        System.out.println(t3.getName() + " interruption status: " + t3.isInterrupted());
        t4.start();
        try {
            t4.interrupt();
        } catch (RuntimeException e) {
            // Exception handled outside thread
        }
    }
}

// Output

// Thread-2 interruption status: true
// Thread-2: Am I interrupted yet? true ... reset interruption status   
// Thread-0: I'm going to sleep for 100ms
// Thread-1: I will wait for 200ms
// Thread-0: My sleep was interrupted! But I'll handle this exception   
// Thread-3: I'm going to sleep for 300ms... Do not disturb!
// Thread-2: I do not sleep or wait
// Thread-3: My sleep was interrupted! I will NOT handle this exception!
// Thread-1: My wait was interrupted! But I'll handle this exception    
// Exception in thread "Thread-3" java.lang.RuntimeException: Thread interrupted in sleep
//         at W7A5Driver$4.run(W7A5Driver.java:37)