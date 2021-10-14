class First{}
class Second{}
class Third{}
class Fourth{}

public class W7A3Driver {
    public static void main(String[] args) {
        First first = new First();
        Second second = new Second();
        Third third = new Third();
        Fourth fourth = new Fourth();
        new Thread() {
            public void run() {
                synchronized(first) {
                    try {
                        sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Locked first and waiting for second to get unlocked");
                    synchronized(second) {

                    }
                }
            }
        }.start();
        new Thread() {
            public void run() {
                synchronized(second) {
                    try {
                        sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Locked second and waiting for third to get unlocked");
                    synchronized(third) {
                        
                    }
                }
            }
        }.start();
        new Thread() {
            public void run() {
                synchronized(third) {
                    try {
                        sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Locked third and waiting for fourth to get unlocked");
                    synchronized(fourth) {
                        
                    }
                }
            }
        }.start();
        new Thread() {
            public void run() {
                synchronized(fourth) {
                    try {
                        sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Locked fourth and waiting for first to get unlocked");
                    synchronized(first) {
                        
                    }
                }
            }
        }.start();
    }
}

// Output

// Locked first and waiting for second to get unlocked
// Locked second and waiting for third to get unlocked
// Locked third and waiting for fourth to get unlocked
// Locked fourth and waiting for first to get unlocked