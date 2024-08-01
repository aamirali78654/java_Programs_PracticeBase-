import java.util.Scanner;
class Array_Eachloop
{
 public static void main(String args[])
 {
     Scanner obj = new Scanner(System.in);
     System.out.println("Enter the row number : ");
     int n = obj.nextInt();
     int num[][] = new int[n][];
     System.out.println("enter the column number : ");
     for(int j=0; j<num.length; j++)
     {
          int m = obj.nextInt();
          num[j] = new int[m];
     }
     System.out.println("value assign : ");
     for(int m =0; m<num.length; m++){
     for(int i=0; i<num[m].length; i++)
     {
         int as = obj.nextInt();
          num[m][i] = as;
     }
System.out.println();
}
     System.out.println("Show result : ");
     System.out.println();
     for(int m[] : num)
     {
     for(int i : m)
     {
          System.out.print("  "+i);
     }
     System.out.println();
}
}
}
