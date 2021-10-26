import java.net.*;

public class W8A5Driver {
    public static void main(String[] args) {
        try {
            DatagramSocket ds = new DatagramSocket();
            ds.connect(InetAddress.getByName("ping.online.net"), 5207);
            System.out.println("Local Socket Address: " + ds.getLocalSocketAddress());
            System.out.println("Port: " + ds.getPort());
            System.out.println("Is closed?: " + ds.isClosed());
            System.out.println("Is connected?: " + ds.isConnected());
            DatagramPacket dp = new DatagramPacket("message".getBytes(), 7, InetAddress.getByName("ping.online.net"), 5207);
            ds.send(dp);
            System.out.println("Receive Buffer Size: " + ds.getReceiveBufferSize());
            ds.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// Output

// Local Socket Address: /192.168.29.63:64614
// Port: 5207
// Is closed?: false
// Is connected?: true
// Receive Buffer Size: 65536