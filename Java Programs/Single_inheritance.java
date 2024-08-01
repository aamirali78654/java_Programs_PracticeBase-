/**
 * Single_inheritance
 */
public class Single_inheritance {

     public static void main(String args[])
     {
          Student ob = new Student();
          ob.add();
     }
}
abstract class Test
{
     int a = 10;
     void add();

}
class Student extends Test
{
     void add()
     {
          System.out.println("value of x "+a);
     }
}
