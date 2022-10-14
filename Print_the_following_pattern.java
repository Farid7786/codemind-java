import java.util.Scanner;
import java.lang.Math;
class Seasons
{
    public static void main(String args[])
    {
        int n,i,j,k;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        k=n;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i==j || (i+j)==(n-1))
                {
                    System.out.print(k+" ");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            k--;
            System.out.println();
        }
        sc.close();
    }
}