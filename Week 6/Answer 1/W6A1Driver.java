class MyRunnable implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName()+ " IS RUNNING AND WILL NOW SLEEP");
        try {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName()+ " IS RUNNING BUT WILL NOW TERMINATE");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class W6A1Driver {
    public static void main(String[] args) {
        MyRunnable runner = new MyRunnable();
        Thread sachin = new Thread(runner, "SACHIN");
        Thread virat = new Thread(runner, "VIRAT");
        Thread sehwag = new Thread(runner, "SEHWAG");
        System.out.println("SACHIN IS " + sachin.getState());
        sachin.start();
        System.out.println("AFTER STARTING, SACHIN IS " + sachin.getState());
        virat.start();
        System.out.println("AFTER STARTING, VIRAT IS " + virat.getState());
        sehwag.start();
        System.out.println("AFTER STARTING, SEHWAG IS " + sehwag.getState());
        System.out.println("SACHIN IS " + sachin.getState());
        System.out.println("VIRAT IS " + virat.getState());
        System.out.println("SEHWAG IS " + sehwag.getState());
        try {
            sehwag.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("SACHIN IS " + sachin.getState());
        System.out.println("VIRAT IS " + virat.getState());
        System.out.println("SEHWAG IS " + sehwag.getState());
    }
}

// OUTPUT

// SACHIN IS NEW
// AFTER STARTING, SACHIN IS RUNNABLE
// SACHIN IS RUNNING AND WILL NOW SLEEP
// AFTER STARTING, VIRAT IS RUNNABLE
// VIRAT IS RUNNING AND WILL NOW SLEEP
// AFTER STARTING, SEHWAG IS RUNNABLE
// SEHWAG IS RUNNING AND WILL NOW SLEEP
// SACHIN IS TIMED_WAITING
// VIRAT IS TIMED_WAITING
// SEHWAG IS TIMED_WAITING
// SACHIN IS RUNNING BUT WILL NOW TERMINATE
// SEHWAG IS RUNNING BUT WILL NOW TERMINATE
// VIRAT IS RUNNING BUT WILL NOW TERMINATE
// SACHIN IS TERMINATED
// VIRAT IS TERMINATED
// SEHWAG IS TERMINATED