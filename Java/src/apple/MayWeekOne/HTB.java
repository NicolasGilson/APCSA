package apple.MayWeekOne;

public class HTB 
{
    static char[][] board = {{'H','H','H'},{'H','H','H'},{'H','H','H'}};
    static int[] binary = new int[9];
    public static void BinaryHT(int n)
    {
        for(int i =8;i>=0;i--)
        {
            if(n-Math.pow(2,i)>=0)
            {
                n-=Math.pow(2,i);
                binary[i]=6;
            }
            else
            {
                binary[i]=-6;
            }
        }
        int counter =0;
        for(int i=2;i>=0;i--)
        {
            for(int j=2;j>=0;j--)
            {
                board[i][j]= (char)(78+binary[counter]);
                counter++;
            }
        }
        for(char[] i: board)
        {
            for(char j: i)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
