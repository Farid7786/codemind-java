import java.util.Scanner;
import java.lang.Math;
class Descending
{
    public static void main(String args[])
    {
        int n,i,j,c=0,m=0,s;
        double k;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        s=sc.nextInt();
        if(n==1)
        {
            n=2;
        }
        for(i=n;i<=s;i++)
        {
            c=0;
            k=Math.sqrt(i);
            for(j=2;j<=k;j++)
            {
                if(i%j==0)
                {
                    c++;
                }
            }
            if(c==0)
            {
               m++;
            }
        }
        System.out.print(m);
    }
}