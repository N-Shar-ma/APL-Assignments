public class W3A5Driver {
    public static void main(String[] args) {
        StoryBook Alice1 = new StoryBook("Alice's Adventures in Wonderland", "Lewis Carroll", 26432);
        SequelStoryBook Alice2 = new SequelStoryBook("Through the Looking Glass", "Lewis Carroll", 22908, Alice1);
        Alice2.read(false);
    }
}

// Output

// Reading the previous book first
// Read the book Alice's Adventures in Wonderland.
// Read the book Through the Looking Glass.