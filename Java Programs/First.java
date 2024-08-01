class First
{
    public static void main(String args[])
    {
        int num[][] = new int[3][];
        num[0] = new int[1];
        num[1] = new int[2];
        num[2] = new int[3];
        num[0][0] = 10;
        num[1][0] = 5;
        num[1][1] = 12;
        num[2][0] = 7;
        num[2][1] = 15;
        num[2][2] = 20;
        for(int i=0; i<num.length; i++)
        {
            for(int j=0; j<num[i].length; j++)
            System.out.print(num[i][j]+"  ");
            System.out.println();
        }

    }
}