class Listandset
{

     public static void main(String[] args)
      {
        int winp [][] = {{0,1,2},{3,4,5}};
         int game[] = {1,2,3,4,5,6,7,8,9};
         for(int []inn : winp)
         {
          System.out.print(game[inn[0]]);
          System.out.print(game[inn[1]]);
          System.out.println(game[inn[2]]);
          System.out.println();
          System.out.println("*****************");
         }                

     }
}