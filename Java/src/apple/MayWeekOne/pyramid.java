package apple.MayWeekOne;

public class pyramid 
{
    public static void pyramidNum(int n)
    {
        for(int i =n; i>0;i--)
        {
            for(int j=i;j>0;j--)
            {
                System.out.print(j+" ");
            }
            for(int t = 2;t<i+1;t++)
            {
                System.out.print(t+" ");
            }
            System.out.println();

        }

    }
}
