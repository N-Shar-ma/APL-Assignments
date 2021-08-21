public class StoryBook {
    String title, author;
    int noOfPages;

    StoryBook(String title, String author, int noOfPages) {
        this.title = title;
        this.author = author;
        this.noOfPages = noOfPages;
    }

    void read() {
        System.out.println("Read the book " + title + ".");
    }
}
