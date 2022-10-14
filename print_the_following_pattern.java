import java.util.Scanner;
import java.lang.Math;
class Seasons
{
    public static void main(String args[])
    {
        int n,i,j,k;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        k=n-1;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i==j || i+j==k)
                {
                    System.out.print("x");
                }
                else
                {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}