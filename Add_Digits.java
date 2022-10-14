import java.util.Scanner;
import java.lang.Math;
class Seasons
{
    public static void main(String args[])
    {
        int n,r,sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n>0)
        {
            r=n%10;
            sum=sum+r;
            n=n/10;
            if(n==0 && sum>=9)
            {
                n=sum;
                sum=0;
            }
        }
        System.out.println(sum);
        sc.close();
    }
}