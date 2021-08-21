public class SequelStoryBook extends StoryBook {
    StoryBook sequelTo;

    SequelStoryBook(String title, String author, int noOfPages, StoryBook sequelTo) {
        super(title, author, noOfPages);
        this.sequelTo = sequelTo;
    }

    void read() {
        System.out.println("Read the book titled " + title + ".");
    }

    void read(boolean readPreviousYet) {
        if(!readPreviousYet) {
            System.out.println("Reading the previous book first");
            sequelTo.read();
        }
        read();
    }
}
