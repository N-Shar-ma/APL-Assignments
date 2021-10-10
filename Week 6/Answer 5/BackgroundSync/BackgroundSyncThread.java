package BackgroundSync;

public class BackgroundSyncThread extends Thread {
    public BackgroundSyncThread(ThreadGroup tg, String name) {
        super(tg, name);
    }
    public void run() {
        System.out.println("Syncing all the data of the app with the cloud");
        for(int i = 0; i < 1000000000; i++);
    }    
}
