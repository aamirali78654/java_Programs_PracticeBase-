class Abstract{
     public static void main(String args[])
     {
          B obj = new B();
          obj.animal();

     }
}
interface A{
      void animal();
      void rank();
}
class B implements A{
       public void animal(){
System.out.println("the tim berners lee");
     }
}