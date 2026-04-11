package FileHandling;

import java.io.*;
public class RandomAccessFilee {
    public static void main(String[] args) {
        int a = 123;
        long b = 435525;
        String s = "Here is some text";

        try {
            RandomAccessFile raf = new RandomAccessFile("Demo.txt", "rw");

            raf.writeInt(a);
            raf.writeLong(b);
            raf.writeUTF(s);

            raf.seek(0);

            System.out.println(raf.readInt());
            System.out.println(raf.readLong());
            System.out.println(raf.readUTF());

            raf.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}


/*

RandomAccessFile raf = new RandomAccessFile("filename.txt", "mode");

            Modes:
            "r" → Read only
            "rw" → Read and Write



1. seek(long position)

Moves file pointer to a specific byte location.
raf.seek(5); // moves pointer to 5th byte


2. readInt(), readLong(), readUTF()
Used to read data types.


3. writeInt(), writeLong(), writeUTF()
Used to write different data types.




Why use writeInt(), writeLong(), writeUTF() instead of only write()?

We use these methods because RandomAccessFile works with different data types safely.

writeInt() → writes an integer correctly (4 bytes)
writeLong() → writes a long correctly (8 bytes)
writeUTF() → writes a string in proper encoded format

👉 Why needed?
Because write() only writes 1 byte, so full data will be corrupted.

🔹 What is seek(0) and why use it?

seek(0) moves the file pointer (cursor) to the beginning of the file.

👉 Why needed?
After writing, the pointer is at the end. To read from the start, we must reset it using seek(0).


 */