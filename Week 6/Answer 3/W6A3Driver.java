class SaniaRunnable implements Runnable {
    public void run() {
        System.out.println("Sania is running and will now sleep for 100ms");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Calling yield on Sania");
        Thread.yield();
        System.out.println("Sania will now stop");
    }
}

class MariaRunnable implements Runnable {
    public void run() {
        System.out.println("Maria is running and will now sleep for 200ms");
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Maria will now stop");
    }
}

class SerenaRunnable implements Runnable {
    public void run() {
        System.out.println("Serena is running and will now sleep for 300ms");
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Serena will now stop");
    }
}

public class W6A3Driver {
    public static void main(String[] args) {
        Thread sania = new Thread(new SaniaRunnable());
        Thread maria = new Thread(new MariaRunnable());
        Thread serena = new Thread(new SerenaRunnable());
        sania.setPriority(5);
        maria.setPriority(5);
        serena.setPriority(5);
        System.out.println("Calling run on Sania");
        System.out.println("Directly calling run on a thread instead of start, makes the thread run in the same stack in which run is called, instead of a new one. Hence it halts execution in this stack, until it finishes running.");
        sania.run();
        System.out.println("Calling start on Maria");
        maria.start();
        System.out.println("Priority of Maria: " + maria.getPriority());
        System.out.println("Calling suspend on Maria");
        maria.suspend();
        System.out.println("Calling start on Serena");
        serena.start();
        try {
            System.out.println("Calling join on Serena");
            serena.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Calling resume on Maria");
        maria.resume();       
    }
}

// Output

// Calling run on Sania
// Directly calling run on a thread instead of start, makes the thread run in the same stack in which run is called, instead of a new one. Hence it halts execution in this stack, until it finishes running.
// Sania is running and will now sleep for 100ms
// Calling yield on Sania
// Sania will now stop
// Calling start on Maria
// Priority of Maria: 5
// Maria is running and will now sleep for 200ms
// Calling suspend on Maria
// Calling start on Serena
// Calling join on Serena
// Serena is running and will now sleep for 300ms
// Serena will now stop
// Calling resume on Maria
// Maria will now stop