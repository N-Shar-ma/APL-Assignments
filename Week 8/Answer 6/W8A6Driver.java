import java.net.*;
import java.util.Arrays;

public class W8A6Driver {
    public static void main(String[] args) {
        try {
            DatagramSocket ds = new DatagramSocket();
            ds.connect(InetAddress.getByName("ping.online.net"), 5207);
            DatagramPacket dp = new DatagramPacket("message".getBytes(), 7, InetAddress.getByName("ping.online.net"), 5203);
            System.out.println("Address: " + dp.getAddress());
            System.out.println("Data: " + Arrays.toString(dp.getData()));
            dp.setPort(5207); // correcting mismatched port number
            System.out.println("Length: " + dp.getLength());
            System.out.println("Offset: " + dp.getOffset());
            System.out.println("Socket Address: " + dp.getSocketAddress());
            ds.send(dp);
            ds.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// Output

// Address: ping.online.net/62.210.18.40
// Data: [109, 101, 115, 115, 97, 103, 101]
// Length: 7
// Offset: 0
// Socket Address: ping.online.net/62.210.18.40:5207