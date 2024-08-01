import java.util.Scanner;
class Studentdata 
{
     public static void main(String[] args) {
          Scanner obj = new Scanner(System.in);
          System.out.print("How many students result upload : ");
          int re = obj.nextInt();
          int mar[] = new int[re];
          int rt[][] = new int[5][5]; 
          String str[] = {"Physics","Chemistry","Math","English","Biology"};
          String name[][] = new String[re][2]; 
          for(int i =0; i<name.length; i++)
          {    
               for(int j=0; j<name[i].length+5; j++)
               {
                    if(j == 0)
                    {
                    obj.nextLine(); 
                    System.out.print((i+1)+" Name : ");
                    name[i][j] = obj.nextLine();
                    }
                    else if(j == 1)
                    {
                    System.out.print("Roll NO: ");
                    name[i][j] = obj.nextLine();
                    }
                     if(j >1)
                    {
                         int b =j-2;
                    System.out.print("Enter "+str[b]+" subject marks : ");
                    rt[i][b] = obj.nextInt();
                    mar[i] = mar[i] + rt[i][b];
               }
               }
               System.out.println("*****************************");
               System.out.println((i+1)+" -!! Student result Completed !! ");
               System.out.println("*****************************");
          }
         for(int i =0; i<name.length; i++)
          {
               System.out.println("*****************************");
               System.out.println((i+1)+" -!! Student Data !! ");
               System.out.println("*****************************");
               for(int j=0; j<name[i].length+5; j++)
               {
                    if(j == 0)
                    {
                    System.out.println((i+1)+" Name : "+name[i][j]);
                    }
                    else if(j == 1)
                    {
                    System.out.println("Roll NO: "+name[i][j]);
                    }
                    else if(j >1)
                    {
                         int b =j-2;
                         
                    System.out.println("Enter "+str[b]+" subject marks : "+rt[i][b]);
                    }
               }
               double total = mar[i]*100/500;
               System.out.println("Total marks : "+mar[i]);
               System.out.println("Persontage : "+total+"%");
               if(total >= 80.0)
               System.out.println("Grade A! ");
               else if(total >= 70.0 && total < 80.0)
               System.out.println("Grade B! ");
               else if(total >= 60.0 && total <70.0)
               System.out.println("Grade C! ");
               else  if(total >= 50.0 && total <60.0)
               System.out.println("Grade D! ");
               else
               System.out.println("Grade F!");
     }
}
}