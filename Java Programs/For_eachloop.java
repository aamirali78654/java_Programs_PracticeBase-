class For_eachloop
{
     public static void main(String args[])
     {
          int num[][] = {{2,4},{5,6,7},{1,8,9,0}};
          for(int i[] : num)
          {
               System.out.print("i value : ");
               System.out.println();
               for(int j : i)
               System.out.print(" "+j);
               System.out.println();
          }
     }
}