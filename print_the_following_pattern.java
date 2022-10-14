import java.util.Scanner;
import java.lang.Math;
class Seasons
{
    public static void main(String args[])
    {
        int n,i,j,k;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                if(j==n|| j==(n-1))
                {
                    continue;
                }
                else
                {
                    System.out.print(j);
                }
            }
            for(k=(n-3);k>0;k--)
            {
               System.out.print(k);
            }
            System.out.println();
        }
        sc.close();
    }
}