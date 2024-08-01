
public class Const {
     Const(int a)
     {
          int z=a;
System.out.println("hello constructor !! "+z);
     }
     Const(int a,int b)
     {
          //int z=a;
System.out.println("hello 2nd constructor !! "+(a+b));
     }

     public static void main(String args[])
     {
     Const obj = new Const(10);
     Const obj1 = new Const(10,7);
      
     }
}