import java.io.PrintStream;

class Table{
    public synchronized void printTable(int n){
        try{
            System.out.println("The multiple of "+n+ " is");

            for (int i=1;i<=10;i++)
            {
                System.out.println(n + "*" + 1 + "=" +  n*i);
                Thread.sleep(500);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
class  MyThread1 extends Thread{
    Table t;
    MyThread1(Table t){
        this.t=t;
    }
    public void run(){
        t.printTable(2);
    }
}

class  MyThread2 extends Thread{
    Table t;
    MyThread2(Table t){
        this.t=t;
    }
    public void run(){
        t.printTable(5);
    }
}

public class MyThread{
    public static void main(String[] args){
        Table t= new Table();

        MyThread1 t1=new MyThread1(t);
        MyThread2 t2=new MyThread2(t);

        t2.start();

        t1.start();

    }
}