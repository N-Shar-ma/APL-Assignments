package UI;

public class UIThread extends Thread {
    public UIThread(ThreadGroup tg, String name) {
        super(tg, name);
    }
    public void run() {
        System.out.println("Displaying UI of the app");
        for(int i = 0; i < 1000000000; i++);
    }
}
