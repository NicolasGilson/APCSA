package apple.MayWeekOne;

public class passChecker
{
    public static boolean checker(String pass)
    {
        if(pass.length()>=10&&pass.matches("[a-zA-Z0-9]+")&&pass.parseInt)
        {
            return true;
        }
        return false;
    }
}
