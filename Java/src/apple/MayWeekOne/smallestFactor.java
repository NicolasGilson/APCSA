package apple.MayWeekOne;

public class smallestFactor 
{
    public static void SF(int n)
    {
        if(n==1)
        {
            System.out.print(1);
        }
        for(int i =2;i<=n;i++)
        {
            if(n%i==0)
            {
                n/=i;
                System.out.print(i);
                i=1;
                if(i!=n)
                {
                    System.out.print(", ");
                }
            }
        }
        System.out.println();
        

    }
}
