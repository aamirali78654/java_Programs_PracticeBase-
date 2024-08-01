class Cons_Test
{
     public static void main(String args[])
     {
        Test obj = new Test(10,20);
        Test onj1 = new Test(30);
        Test mm = new Test(20,3.7f);
     }
}
// constructor overloading parameter pass .
class Test
{
     Test(int a)
     {
          System.out.println("the value is : "+a);
     }
     Test(int b, int c)
     {
          System.out.println("the 2nd value is : "+b+" the c value : "+c);
     }
     Test(int a, float m)
     {
          System.out.println("the floating value : "+m);
     }
}