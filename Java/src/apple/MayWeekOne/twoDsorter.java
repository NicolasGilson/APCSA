package apple.MayWeekOne;

import java.util.Arrays;

public class twoDsorter 
{
    public static void sort(int m[][])
    {
        Arrays.sort(m, (a, b) -> Integer.compare(a[0],b[0]));
        for(int i=0;i<m.length-1;i++)
        {
            for(int j=0;j<m.length-1;j++)
            {
                if(m[j][0]==m[j+1][0])
                {
                    int temp =Math.min(m[j][1],m[j+1][1]);
                    int x = Math.max(m[j][1],m[j+1][1]);
                    m[j][1]=x;
                    m[j+1][1]=temp;
                }
            }
        }
        for(int[] i : m)
        {
            for(int j : i)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
