import java.io.IOException;

public class W6A7Driver {
    public void finalize() {
        System.out.println("garbage collection done!");
    }
    public static void main(String[] args) throws IOException {
        W6A7Driver obj = new W6A7Driver();
        obj = null;
        System.gc();
        Runtime.getRuntime().exec("notepad");
        Runtime.getRuntime().exec("touch mythread.java");
    }
}

// Output
// garbage collection done!
// (also, notepad opens, and a new file named mythread.java is created)