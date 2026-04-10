import java.util.*;
public class chapter1 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the no of row");
        int row=sc.nextInt();

        System.out.println("enter the no of coln");
        int col=sc.nextInt();
        int[][] numbers= new int[row][col];

        //for input
        System.out.println("enter the data");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++){

                numbers[i][j]  = sc.nextInt() ;
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++){

                System.out.println(numbers[i][j]);
            }

        }






    }
}
