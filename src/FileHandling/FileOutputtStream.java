package FileHandling;

import java.io.*;

public class FileOutputtStream {
    public static void main(String[] args) {
        try {
            FileOutputStream fo = new FileOutputStream("hello.txt");   //FileOutputStream automatically creates file also if not exists

            String data = "Hello World!!!";

            byte[] b = data.getBytes();   // convert string to bytes string-> 01001000 01101001 ...

            fo.write(b);                  // write bytes into file

            fo.close();                   // close file

            System.out.println("Data written successfully");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
