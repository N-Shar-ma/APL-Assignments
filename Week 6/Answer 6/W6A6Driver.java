class ShutDownRunnable1 implements Runnable {
    public void run() {
        System.out.println("The shutdown hook 1 is running");
    }
}

class ShutDownRunnable2 implements Runnable {
    public void run() {
        System.out.println("The shutdown hook 2 is running");
    }
}

class ShutDownRunnable3 implements Runnable {
    public void run() {
        System.out.println("The shutdown hook 3 is running");
    }
}

public class W6A6Driver {
    public static void main(String[] args) {
        ShutDownRunnable1 shutDownRunnable1 = new ShutDownRunnable1();
        ShutDownRunnable2 shutDownRunnable2 = new ShutDownRunnable2();
        ShutDownRunnable3 shutDownRunnable3 = new ShutDownRunnable3();
        Runtime.getRuntime().addShutdownHook(new Thread(shutDownRunnable1));
        Runtime.getRuntime().addShutdownHook(new Thread(shutDownRunnable2));
        Runtime.getRuntime().addShutdownHook(new Thread(shutDownRunnable3));
        System.out.println("Shutdown hooks will run after this before exit");
    }
}

// Output

// Shutdown hooks will run after this before exit
// The shutdown hook 1 is running
// The shutdown hook 3 is running
// The shutdown hook 2 is running