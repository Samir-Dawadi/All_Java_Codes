package UDP;

import java.net.*;
import java.io.*;

public class client
{
    public static void main(String args[]) throws IOException
    {
        // Step 1: Create DatagramSocket
        DatagramSocket socket =
                new DatagramSocket();

        // Step 2: Create byte array
        byte[] buf = new byte[256];

        // Step 3: Convert message into bytes
        String msg = "Hello Server";

        buf = msg.getBytes();

        // Step 4: Get localhost address
        InetAddress address =
                InetAddress.getByName("localhost");

        // Step 5: Create packet
        DatagramPacket packet =
                new DatagramPacket(
                        buf,
                        buf.length,
                        address,
                        4445
                );

        // Step 6: Send packet
        socket.send(packet);

        System.out.println("Message Sent");

        // Step 7: Create packet for receiving
        packet = new DatagramPacket(buf, buf.length);

        // Step 8: Receive packet
        socket.receive(packet);

        // Step 9: Convert received data into string
        String received =
                new String(packet.getData(), 0,
                        packet.getLength());

        System.out.println("From Server: " + received);

        // Step 10: Close socket
        socket.close();
    }
}
