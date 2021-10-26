import java.net.URL;

public class W8A3Driver {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://felvin.com/search?q=merge%20pdfs");
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());
            System.out.println("Port: " + url.getPort());
            System.out.println("Authority: " + url.getAuthority());
            System.out.println("URI: " + url.toURI());
            System.out.println("Query: " + url.getQuery());            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// Output

// Protocol: https
// Host: felvin.com
// Port: -1
// Authority: felvin.com
// URI: https://felvin.com/search?q=merge%20pdfs
// Query: q=merge%20pdfs