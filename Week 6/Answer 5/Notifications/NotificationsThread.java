package Notifications;

public class NotificationsThread extends Thread {
    public NotificationsThread(ThreadGroup tg, String name) {
        super(tg, name);
    }
    public void run() {
        System.out.println("Checking for and receiving notifications of the app");
        for(int i = 0; i < 1000000000; i++);
    }    
}

