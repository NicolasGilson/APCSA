package apple.MayWeekOne;

public class cTOf 
{
    public static double convertTempC(double c)
    {
        double val = (c*1.8)+32;
        val *= Math.pow(10, 3);
        val = Math.floor(val);
        val /= Math.pow(10, 3);
        return val;
    }
    public static double convertTempF(double f)
    {
        double val =(f-32)*(5.0/9);
        val *= Math.pow(10, 3);
        val = Math.floor(val);
        val /= Math.pow(10, 3);
        return val;
    }
}