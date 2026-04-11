package FileHandling;

public class ExtraInfo {
    public static void main(String[] args) {
        System.out.println("ExtraInfo");
    }
}



/*
FileInputStream/FileOutputStream are used for binary data,
while FileReader/FileWriter are used for text (character) data operations.


FileReader is used for character-based reading where byte data is automatically converted into characters,
while FileInputStream is used for low-level raw byte reading of all file types including images, audio, and video.

“Reader = text (converted), Stream = raw bytes”

*/





/*
Append at end of file

import java.io.FileWriter;
import java.io.IOException;

public class AppendEnd {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("file.txt", true);
            fw.write("Hello End\n");
            fw.close();

        } catch (Exception e) {
            System.out.println(e.getMessage);
        }
    }
}





 */



/*
Insert at START

import java.io.*;
import java.nio.file.*;

public class InsertStart {
    public static void main(String[] args) {
        try {
            // read old content
            String old = Files.readString(Path.of("file.txt"));

            // write new content at start
            FileWriter fw = new FileWriter("file.txt");
            fw.write("Hello Start\n" + old);
            fw.close();

        } catch (Exception e) {
            System.out.println(e.getMessage);
        }
    }
}

 */






/*
Insert in MIDDLE

import java.io.*;

public class InsertMiddle {
    public static void main(String[] args) {
        try {
            String[] lines = new String(java.nio.file.Files.readAllBytes(
                    java.nio.file.Paths.get("file.txt"))).split("\n");

            FileWriter fw = new FileWriter("file.txt");

            for (int i = 0; i < lines.length; i++) {
                fw.write(lines[i] + "\n");

                if (i == 1) {
                    fw.write("INSERT MIDDLE\n");
                }
            }

            fw.close();

        } catch (Exception e) {
            System.out.println(e.getMessage);
        }
    }
}

*/
