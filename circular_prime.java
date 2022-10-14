import java.util.Scanner;
import java.lang.Math;
class Seasons
{
    public static void main(String args[])
    {
        int n,k,r,sum=0,i,j,c=0,m=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        k=n;
        while(n>0)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        for(i=1;i<=k;i++)
        {
            if(k%i==0)
            {
                c++;
            }
        }
        for(j=1;j<=sum;j++)
        {
            if(sum%j==0)
            {
                m++;
            }
        }
        if(c==2 && m==2)
        {
            System.out.println("circular prime");
        }
        else if(c==2 && m!=2)
        {
            System.out.println("prime but not a circular prime");
        }
        else if(c!=2 && m!=2)
        {
            System.out.println("not prime");
        }
        sc.close();
    }
}