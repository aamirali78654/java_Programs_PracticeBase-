import java.util.Scanner;
public class Example {

     public static void main(String[] args) 
     {
          
          Scanner obj = new Scanner(System.in);
          int n;
          System.out.println("enter the array row number : ");
          n = obj.nextInt();
          int a[] = new int[n];
          System.out.println("Enter the array numbers : ");
          for(int i=0; i<a.length; i++)
          {
               a[i] = obj.nextInt();
          }
          System.out.println("the result of array:");
          for(int i=0; i<a.length; i++)
          {
               System.out.print("  "+a[i]);
          }

     }
}
