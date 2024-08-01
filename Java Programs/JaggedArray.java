/*class First
{
    public static void main(String args[])
    {
        // jagged array length for columns and rows ..

        int num[][] = new int[3][];
        num[0] = new int[1];
        num[1] = new int[2];
        num[2] = new int[3];
        num[0][0] = 10;
        num[1][0] = 5;
        num[1][1] = 12;
        num[2][0] = 7;
        num[2][1] = 15;
        num[2][2] = 20;
        for(int i=0; i<num.length; i++)
        {
            for(int j=0; j<num[i].length; j++)
            System.out.print(num[i][j]+"  ");
            System.out.println();
        }

    }
}*/
import java.util.Scanner;
class JaggedArray
{
    public static void main(String args[])
    {
     Scanner obj = new Scanner(System.in);
     System.out.println("the write th number of row is : ");
     int m = obj.nextInt();
        int num[][] = new int[m][];
        for(int i=0; i<m; i++)
        {
          System.out.print("the write the number of columns : "+(i+1)+" : ");
          int n = obj.nextInt();
           num[i] = new int[n]; 
        }
 
      for(int i=0; i<num.length; i++)
        {
          for(int j=0; j<num[i].length; j++)
          num[i][j] = obj.nextInt();
        }

        for(int i=0; i<num.length; i++)
        {
            for(int j=0; j<num[i].length; j++)
            System.out.print(" "+num[i][j]);
            System.out.println();
        }
    }
}