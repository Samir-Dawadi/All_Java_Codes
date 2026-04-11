package FileHandling;

import java.io.*;
public class FileWriterDemo {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("Demo.txt");   //replaces all the content available at data.txt file

            String str = "Write this string to my file";

            fw.write(str);

            fw.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}


