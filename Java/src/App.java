import apple.MayWeekOne.cTOf;
import apple.MayWeekOne.centInch;

public class App {
    public static void main(String[] args) throws Exception 
    {
        System.out.println("C to F");
        for(int i =0; i<=100;i+=2)
        {
            System.out.println(i+"   "+cTOf.convertTempC(i));
        }
        System.out.println("Centimetre to Inch");
        for(int i =0; i<=10;i++)
        {
            System.out.println(i+"   "+centInch.toInch(i));
        }
        System.out.println("");
        for(int i =0,c=0,f=20; i<=50;i++,c+=2,f+=5)
        {
            System.out.println(c+"   C:"+cTOf.convertTempC(c)+"     |     "+f+"    "+cTOf.convertTempF(f));
        }
    }
}