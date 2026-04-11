package FileHandling;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("data.txt");

            int c;

            while ((c = fr.read()) != -1) {
                System.out.print((char) c);
            }

            fr.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}