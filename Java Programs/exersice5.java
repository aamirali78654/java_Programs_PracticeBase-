//import java.util.Scanner();
public class exersice5 {
     String name ;
     char g ;
   
     void input()
     {
          
          java.util.Scanner obj = new java.util.Scanner(System.in);
          System.out.print("enter course name : ");
          name = obj.nextLine();
          System.out.print("enter grade which one : ");
          g = obj.next().charAt(0);

     }
     void output()
     {
          System.out.println("Course Name : "+name);

          if(g == 'A'||g=='B'||g=='C'||g=='D'||g=='F'||
             g == 'a'||g=='b'||g=='c'||g=='d'||g=='f')
          {
          System.out.println("Grade : "+g);}
          else
          {
          System.out.println("the wrong grade select here : "+g);}

     }
     public static void main(String[] args) {
          exersice5 ob = new exersice5();
          ob.input();
          ob.output();
     }  
}