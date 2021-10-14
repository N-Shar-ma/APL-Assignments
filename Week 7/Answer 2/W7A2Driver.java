class Shared {
    String name;

    Shared(String name) {
        this.name = name;
    }

    synchronized static void syncStat(String objName) {
        System.out.println("Start of synchronized method. Object: " + objName + ", currently locked by " + Thread.currentThread().getName());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
        System.out.println("Middle of synchronized method. Object: " + objName + ", still locked by " + Thread.currentThread().getName());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("End of synchronized method. Object: " + objName + ", still locked by " + Thread.currentThread().getName());        
    }

    void demosyncStat() {
        syncStat(this.name);
    }
}

public class W7A2Driver {
    public static void main(String[] args) {
        new Thread() {
            public void run() {
                new Shared("uno").demosyncStat();
            }
        }.start();
        new Thread() {
            public void run() {
                new Shared("dos").demosyncStat();
            }
        }.start();        
        new Thread() {
            public void run() {
                new Shared("tres").demosyncStat();
            }
        }.start();
    }
}

// Output

// Start of synchronized method. Object: uno, currently locked by Thread-0
// Middle of synchronized method. Object: uno, still locked by Thread-0
// End of synchronized method. Object: uno, still locked by Thread-0
// Start of synchronized method. Object: dos, currently locked by Thread-1
// Middle of synchronized method. Object: dos, still locked by Thread-1
// End of synchronized method. Object: dos, still locked by Thread-1
// Start of synchronized method. Object: tres, currently locked by Thread-2
// Middle of synchronized method. Object: tres, still locked by Thread-2
// End of synchronized method. Object: tres, still locked by Thread-2