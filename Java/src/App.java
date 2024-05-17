import apple.MayWeekOne.ASCII;
import apple.MayWeekOne.GCD;
import apple.MayWeekOne.pyramid;
import apple.MayWeekOne.smallestFactor;


public class App {
    public static void main(String[] args) throws Exception 
    {
        System.out.println("GCD");
        System.out.println("4,19 GCD:"+GCD.commonDiv(4, 19));
        System.out.println("18,12 GCD:"+GCD.commonDiv(18, 12));
        System.out.println("1,3 GCD:"+GCD.commonDiv(1, 3));
        System.out.println("12,4 GCD:"+GCD.commonDiv(12, 4));
        System.out.println("\nASCII");
        ASCII.ASCT();
        System.out.println("\nFactors of an integers");
        smallestFactor.SF(120);
        smallestFactor.SF(33);
        smallestFactor.SF(187);
        smallestFactor.SF(1);
        System.out.println("\nFNumber pyramid");
        pyramid.pyramidNum(7);
    }
}