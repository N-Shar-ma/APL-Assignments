import java.net.*;

public class W8A4Driver {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.felvin.com");
            HttpURLConnection connection = (HttpURLConnection)url.openConnection();
            System.out.println("Follow Redirects?: " + HttpURLConnection.getFollowRedirects());          
            System.out.println("Miliseconds since 1970 January 1 GMT, represented by header field \"last-modified\": " + connection.getHeaderFieldDate("last-modified", 0));          
            System.out.println("Request Method: " + connection.getRequestMethod());          
            System.out.println("Using Proxy?: " + connection.usingProxy());     
            connection.disconnect();   // since streaming mode cannot be set while in connected state  
            connection.setFixedLengthStreamingMode(1000000000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// Output

// Follow Redirects?: true
// Miliseconds since 1970 January 1 GMT, represented by header field "last-modified": 1635250628000
// Request Method: GET
// Using Proxy?: false