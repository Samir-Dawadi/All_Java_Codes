package UDP;

import java.net.*;
import java.io.*;

public class server
{
    public static void main(String args[]) throws IOException
    {
        // Step 1: Create byte array
        byte[] buf = new byte[256];

        // Step 2: Create DatagramSocket at port 4445
        DatagramSocket socket =
                new DatagramSocket(4445);

        System.out.println("UDP Server Started...");
        System.out.println("Waiting for client message...");

        // Step 3: Create packet for receiving data
        DatagramPacket packet =
                new DatagramPacket(buf, buf.length);

        // Step 4: Receive packet
        socket.receive(packet);

        // Step 5: Get client address
        InetAddress address = packet.getAddress();

        // Step 6: Get client port
        int port = packet.getPort();

        // Step 7: Read client message
        String received =
                new String(packet.getData(), 0,
                        packet.getLength());

        System.out.println("From Client: " + received);

        // Step 8: Create message to send
        String s = "Hello Client";

        buf = s.getBytes();

        // Step 9: Create packet to send
        packet = new DatagramPacket(
                buf,
                buf.length,
                address,
                port
        );

        // Step 10: Send packet
        socket.send(packet);

        System.out.println("Reply Sent");

        // Step 11: Close socket
        socket.close();
    }
}
