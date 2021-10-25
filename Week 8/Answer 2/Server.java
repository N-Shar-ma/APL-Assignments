import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(8000);
            Socket s = ss.accept();
            DataInputStream dis = new DataInputStream(s.getInputStream());
            String data = dis.readUTF();
            System.out.println("Data sent to this server: " + data);
            ss.close();            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// Output

// Data sent to this server: From Client at port 8080 to server!