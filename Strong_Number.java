import java.util.Scanner;
import java.lang.Math;
class Seasons
{
    public static void main(String args[])
    {
        int n,p=1,k,r,sum=0,i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        k=n;
        while(n>0)
        {
            p=1;
            r=n%10;
            for(i=1;i<=r;i++)
            {
                p=p*i;
            }
            sum=sum+p;
            n=n/10;
        }
        if(sum==k)
        {
            System.out.println("The number "+k+" is a strong number");
        }
        else
        {
           System.out.println("The number "+k+" is not a strong number");   
        }
        sc.close();
    }
}