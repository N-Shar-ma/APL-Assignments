public class W6A2Driver {
    public static void main(String[] args) {
        Thread sania = new Thread() {
            public void run() {
                System.out.println("Sania is running and will now sleep for 100ms");
                try {
                    sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Calling yield on Sania");
                Thread.yield();
                System.out.println("Sania will now stop");
            }
        };
        Thread maria = new Thread() {
            public void run() {
                System.out.println("Maria is running and will now sleep for 200ms");
                try {
                    sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Maria will now stop");
            }
        };
        Thread serena = new Thread() {
            public void run() {
                System.out.println("Serena is running and will now sleep for 300ms");
                try {
                    sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Serena will now stop");
            }
        };
        sania.setPriority(8);
        maria.setPriority(7);
        serena.setPriority(6);
        System.out.println("Calling run on Sania");
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
// Sania is running and will now sleep for 100ms
// Calling yield on Sania
// Sania will now stop
// Calling start on Maria
// Maria is running and will now sleep for 200ms
// Priority of Maria: 7
// Calling suspend on Maria
// Calling start on Serena
// Calling join on Serena
// Serena is running and will now sleep for 300ms
// Serena will now stop
// Calling resume on Maria
// Maria will now stop