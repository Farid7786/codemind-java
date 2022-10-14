import java.util.Scanner;
import java.lang.Math;
class Seasons
{
    public static void main(String args[])
    {
        int n,k,r,sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        k=n;
        while(n>0)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        System.out.println(sum);
        sc.close();
    }
}