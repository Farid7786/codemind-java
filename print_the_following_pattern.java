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
                System.out.print((char)(64+i)+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}