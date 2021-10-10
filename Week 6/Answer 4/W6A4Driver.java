class SimpleRunnable implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running...");
        for(int i = 0; i < 1000000000; i++) {}
        System.out.println(Thread.currentThread().getName() + " is terminating...");
    }
}

class DaemonRunnable implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running...");
        for(int i = 0; i < 1000000000; i++) {
            System.out.println(i + "/1000000000: this will likely terminate before completion since it is a daemon thread");
        }
    }
}

public class W6A4Driver {
    public static void main(String[] args) {
        SimpleRunnable simpleRunnable = new SimpleRunnable();
        DaemonRunnable daemonRunnable = new DaemonRunnable();
        Thread daemon = new Thread(daemonRunnable, "daemon");
        daemon.setDaemon(true);
        Thread normal1 = new Thread(simpleRunnable, "normal1");
        Thread normal2 = new Thread(simpleRunnable, "normal2");
        normal1.start();
        normal2.start();
        daemon.start();
        System.out.println("State of daemon: " + daemon.getState());
        try {
            normal1.join();
            normal2.join();            
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("State of normal1: " + normal1.getState());
        System.out.println("State of normal2: " + normal2.getState());
    }
}

// Output

// State of daemon: RUNNABLE
// daemon is running...
// normal1 is running...
// normal2 is running...
// 0/1000000000: this will likely terminate before completion since it is a daemon thread       
// normal2 is terminating...
// normal1 is terminating...
// 1/1000000000: this will likely terminate before completion since it is a daemon thread
// State of normal1: TERMINATED
// State of normal2: TERMINATED
// 2/1000000000: this will likely terminate before completion since it is a daemon thread       
// 3/1000000000: this will likely terminate before completion since it is a daemon thread       