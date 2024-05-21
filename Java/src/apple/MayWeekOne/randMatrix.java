package apple.MayWeekOne;

public class randMatrix 
{
    private static int[][] mat = new int[3][3];

    public static void printMat()
    {
        for(int[] i : mat)
        {
            for(int j : i)
            {
                j = (int)(Math.random()*2);
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
