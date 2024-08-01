class Access_modi
{
     public static void main(String args[])
     {
          System.out.println("");
          computer obj = new computer();
          obj.showdata();
     }
}
class Laptop
{
     public int a = 10;
     protected void disp()
     {
      System.out.println("hello geekyshows !! "+a);
     }
}
class computer extends Laptop
{
     int b =30;
     int c = a+b;
     void showdata()
     {
          System.out.println("additon result : "+c);
     }
}