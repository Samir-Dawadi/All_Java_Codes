package TCP;

import java.net.*;
import java.io.*;
import java.util.*;

public class server
{
    public static void main(String args[]) throws IOException
    {
        // Step 1: Create ServerSocket at port 1254
        ServerSocket ss = new ServerSocket(1254);

        System.out.println("Server Started...");
        System.out.println("Waiting for client...");

        // Step 2: Accept client connection
        Socket cs = ss.accept();

        System.out.println("Client Connected");

        // Step 3: Create input stream
        Scanner ins = new Scanner(cs.getInputStream());

        // Step 4: Create output stream
        PrintWriter outs =
                new PrintWriter(cs.getOutputStream(), true);

        // Step 5: Receive message from client
        String s = ins.nextLine();

        System.out.println("From Client: " + s);

        // Step 6: Send message to client
        outs.println("Hello Client");

        // Step 7: Close everything
        outs.close();
        ins.close();
        cs.close();
        ss.close();
    }
}
