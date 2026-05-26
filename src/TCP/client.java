package TCP;

import java.net.*;
import java.io.*;
import java.util.*;

public class client
{
    public static void main(String args[]) throws IOException
    {
        // Step 1: Connect to server
        Socket cs = new Socket("localhost", 1254);

        System.out.println("Connected to Server");

        // Step 2: Create input stream
        Scanner ins =
                new Scanner(cs.getInputStream());

        // Step 3: Create output stream
        PrintWriter outs =
                new PrintWriter(cs.getOutputStream(), true);

        // Step 4: Send message to server
        outs.println("Hello Server");

        // Step 5: Receive message from server
        String s = ins.nextLine();

        System.out.println("From Server: " + s);

        // Step 6: Close everything
        ins.close();
        outs.close();
        cs.close();
    }
}
