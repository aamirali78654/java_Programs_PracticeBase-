import java.util.Scanner;
 class Inter_face {
public static void main(String args[])
{
     Test obj = new Raza();
     
     obj.input();
     obj.output();


}    
}

interface Test{
     void input();
     void output();
}

 class Raza implements Test
{
     int a;
     String str;
      public void input()
     {
          Scanner obj = new Scanner(System.in);
          System.out.print("enter the number : ");

          a = obj.nextInt();
          System.out.println("String input : ");
          str = obj.nextLine();
     }
    public void output()
{
          System.out.println("the number : "+a);
          System.out.println("the string : "+str);
     }
}