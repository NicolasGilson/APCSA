package apple.MayWeekOne;

public class GCD 
{
    public static int commonDiv(int n1 , int n2)
    {
        int max = Math.max(n1, n2);
        int min = Math.min(n1, n2);
        int mod = max%min;
        if(mod==0)
        {
            return min;
        }
        
        return commonDiv(min,(max-min));
    }
}
