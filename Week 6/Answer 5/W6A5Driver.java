import UI.UIThread;
import Notifications.NotificationsThread;
import BackgroundSync.BackgroundSyncThread;

public class W6A5Driver {
    public static void main(String[] args) {
        ThreadGroup myApp = new ThreadGroup("IIIT Lucknow's Social Media App");
        Thread ui = new UIThread(myApp, "User Interface");
        Thread notifications = new NotificationsThread(myApp, "Push Notifications");
        Thread backgroundSync = new BackgroundSyncThread(myApp, "Cloud-Device Background Sync");
        ui.start();
        notifications.start();
        backgroundSync.start();
        Thread[] appThreads = new Thread[myApp.activeCount()]; 
        System.out.println("The number of active threads in my app: " + myApp.activeCount());
        myApp.enumerate(appThreads);
        for(Thread thread: appThreads) {
            System.out.println("One of the active threads is: " + thread.getName());
        }
        System.out.println("The name of my app: " + myApp.getName());
        System.out.println("The highest priority in my app: " + myApp.getMaxPriority());
        myApp.setMaxPriority(8);
        System.out.println("Setting highest priority in my app to 8...");
        System.out.println("The highest priority in my app: " + myApp.getMaxPriority());
        System.out.println("The daemon status of my app: " + myApp.isDaemon());
        System.out.println("The working status of my app: " + !myApp.isDestroyed());
        myApp.destroy();
        System.out.println("Destroying my app...");
        System.out.println("The working status of my app: " + !myApp.isDestroyed());
        System.out.println("The stringification of my app: " + myApp.toString());
    }
}

// Output

// The number of active threads in my app: 3
// Syncing all the data of the app with the cloud
// Displaying UI of the app
// Checking for and receiving notifications of the app
// One of the active threads is: User Interface
// One of the active threads is: Push Notifications
// One of the active threads is: Cloud-Device Background Sync
// The name of my app: IIIT Lucknow's Social Media App
// The highest priority in my app: 10
// Setting highest priority in my app to 8...
// The highest priority in my app: 8
// The daemon status of my app: false
// The working status of my app: true
// Destroying my app...
// The working status of my app: false
// The stringification of my app: java.lang.ThreadGroup[name=IIIT Lucknow's Social Media App,maxpri=8]