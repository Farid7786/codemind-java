import java.util.Scanner;
import java.lang.Math;
class Seasons
{
    public static void main(String args[])
    {
        int n,k,r,sum=0,i,j,c=0,m=0,s=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        k=n;
        for(i=1;i<=k;i++)
        {
            if(k%i==0)
            {
                c++;
            }
        }
        while(n>0)
        {
            r=n%10;
            m=0;
            for(j=1;j<=r;j++)
            {
               if(r%j==0)
                {
                  m++;
                }
            }
            if(m==2)
            {
                s++;
            }
            sum++;
            n=n/10;
        }
        if(c==2 && s==sum)
        {
            System.out.println("Mega Prime");
        }
        else
        {
            System.out.println("Not Mega Prime");
        }
        sc.close();
    }
}