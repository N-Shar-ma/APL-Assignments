public class Rest extends Thread {
    Person person;
    Rest(Person person) {
        this.person = person;
    }
    public void run() {
        synchronized(person) {
            System.out.println(person.name + " intends to rest now...");
            if(!person.completedWork) {
                System.out.println(person.name + " first needs to complete work before resting.");
                try {
                    person.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(person.name + " is starting to rest...");
            System.out.println(person.name + " has completed resting.");
            person.notify();
        }
    }
}
