interface A{
    void display();
}

public class InterfaceMain implements A{
    public void display(){
        System.out.println("display func");
    }
    public static void main(String[] args){

        InterfaceMain obj= new InterfaceMain();
        obj.display();
    }
}
