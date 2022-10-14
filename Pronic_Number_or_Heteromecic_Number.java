import java.util.Scanner;
import java.lang.Math;
class Seasons
{
    public static void main(String args[])
    {
        int n,i,k,c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            k=i*(i+1);
            if(k==n)
            {
                c++;
                break;
            }
        }
        if(c==0)
        {
            System.out.println("NO");
        }
        else
        {
            System.out.println("YES");
        }
        sc.close();
    }
}