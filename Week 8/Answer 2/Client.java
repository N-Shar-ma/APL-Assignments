import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 8000);
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            dos.writeUTF("From Client at port 8080 to server!");
            dos.flush();
            dos.close();
            s.close();            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
