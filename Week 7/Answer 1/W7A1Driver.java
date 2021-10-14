class Shared {
    synchronized void syncMethod() {
        System.out.println("Start of synchronized method. Currently locked by " + Thread.currentThread().getName());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
        System.out.println("Middle of synchronized method. Still locked by " + Thread.currentThread().getName());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("End of synchronized method. Still locked by " + Thread.currentThread().getName());
    }
    
    void syncBlock() {
        System.out.println("Before synchronized blocked. Current thread is " + Thread.currentThread().getName());
        synchronized(this) {
            System.out.println("Start of synchronized block. Currently locked by " + Thread.currentThread().getName());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
            System.out.println("Middle of synchronized block. Still locked by " + Thread.currentThread().getName());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("End of synchronized block. Still locked by " + Thread.currentThread().getName());
        }
        System.out.println("After synchronized blocked. Current thread is " + Thread.currentThread().getName());
    }
}

public class W7A1Driver {
    public static void main(String[] args) {
        Shared shared = new Shared();
        new Thread() {
            public void run() {
                shared.syncMethod();
                shared.syncBlock();
            }
        }.start();
        new Thread() {
            public void run() {
                shared.syncMethod();
                shared.syncBlock();
            }
        }.start();
    }
}

// Output

// Start of synchronized method. Currently locked by Thread-0
// Middle of synchronized method. Still locked by Thread-0
// End of synchronized method. Still locked by Thread-0
// Before synchronized blocked. Current thread is Thread-0   
// Start of synchronized method. Currently locked by Thread-1
// Middle of synchronized method. Still locked by Thread-1
// End of synchronized method. Still locked by Thread-1
// Before synchronized blocked. Current thread is Thread-1  
// Start of synchronized block. Currently locked by Thread-0
// Middle of synchronized block. Still locked by Thread-0
// End of synchronized block. Still locked by Thread-0
// Start of synchronized block. Currently locked by Thread-1
// After synchronized blocked. Current thread is Thread-0
// Middle of synchronized block. Still locked by Thread-1
// End of synchronized block. Still locked by Thread-1
// After synchronized blocked. Current thread is Thread-1