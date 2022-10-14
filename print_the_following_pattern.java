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
            for(j=n;j>=1;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}