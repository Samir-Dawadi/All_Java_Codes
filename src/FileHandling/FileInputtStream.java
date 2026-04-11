package FileHandling;

import java.io.*;
public class FileInputtStream {
    public static void main(String[] args){
        try {
            FileInputStream fis = new FileInputStream("data.txt");  //relative path
            int i;
            while((i=fis.read())!=-1){
                System.out.print((char)i);
            }
            fis.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}



/*

Using Object

    public class FileInputtStream {
    public static void main(String args[]) {
        try {
            File f = new File("data.txt");
            FileInputStream f1 = new FileInputStream(f);
            int i;

            while((i = f1.read()) != -1) {
                System.out.print((char) i);
            }

            f1.close();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}


 */