import apple.MayWeekOne.GCD;

public class App {
    public static void main(String[] args) throws Exception 
    {
        System.out.println("GCD");
        System.out.println("4,19 GCD:"+GCD.commonDiv(4, 19));
        System.out.println("18,12 GCD:"+GCD.commonDiv(18, 12));
        System.out.println("1,3 GCD:"+GCD.commonDiv(1, 3));
        System.out.println("12,4 GCD:"+GCD.commonDiv(12, 4));
        System.out.println("\nASCII");
        for(int i =33;i<=126;i++)
        {
            System.out.println((char)i);
        }
    }
}