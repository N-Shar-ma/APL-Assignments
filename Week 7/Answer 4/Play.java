public class Play extends Thread {
    Person person;
    Play(Person person) {
        this.person = person;
    }
    public void run() {
        synchronized(person) {
            System.out.println(person.name + " intends to play now...");
            if(!person.completedWork) {
                System.out.println(person.name + " first needs to complete work before playing.");
                try {
                    person.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(person.name + " is starting to play...");
            System.out.println(person.name + " has completed playing.");
            person.notify();
        }
    }
}
