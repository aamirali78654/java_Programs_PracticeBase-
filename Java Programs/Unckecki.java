import java.util.Scanner;

class lowblance extends RuntimeException 
{
     lowblance () 
     {
          super("insuficiant balance! ");
     }
}

class Empe
{
     public void ee(int m)
     {
     int money = m;
     Scanner hr = new Scanner(System.in);
     System.out.println("enter the transfer money !");
     int amount = hr.nextInt();
     if(money<amount)
     {
          try
          {
             throw new lowblance();
          }
          catch(lowblance e)
          {
               System.out.println("insuficiant balance! ");
          }
     }
     else
     {
     int bal = money - amount;
     System.out.println("successfully transaction !");
     System.out.println("your balance is "+bal);
     }
     }
}
public class Unckecki {

     public static void main(String[] args) throws lowblance
     {
          Empe j = new Empe();
          j.ee(10000);
     }
}