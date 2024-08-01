class Static_method
{
     int a = 10;
     static int b=20;
     public static void main(String args[])
     {
          Static_method obj = new Static_method();
          obj.disp();
          Static_method.Show();

     }
     static void Show() //static method .
     {    
          System.out.println(" Show() "+b);
     }
     void disp() //instance / non-static method
     {
          System.out.println("disp() "+a+" "+b);
     }
}