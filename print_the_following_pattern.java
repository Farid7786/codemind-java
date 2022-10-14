import java.util.Scanner;
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
                if(j==0 || i==j || i+j==k)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            k++;
            System.out.println();
        }
        sc.close();
    }
}