public class W7A4Driver {
    public static void main(String[] args) {
        Person person = new Person("Jane", false);
        Work work = new Work(person);
        Play play = new Play(person);
        Rest rest = new Rest(person);
        rest.start();
        play.start();
        work.start();
    }
}

// Output

// Jane intends to rest now...
// Jane first needs to complete work before resting.
// Jane intends to play now...
// Jane first needs to complete work before playing.
// Jane intends to work now...
// Jane is starting work...
// Jane has completed work.
// Jane is starting to rest...
// Jane has completed resting.
// Jane is starting to play...
// Jane has completed playing.