import java.util.Scanner;
class Pattern
{
    public static void main(String args[])
    {
        int n,i,j;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(3<=n && n<=100)
        {
            for(i=1;i<=n;i++)
            {
              for(j=1;j<=i;j++)
              {
                 System.out.print("*");
              }
              System.out.println();
            }
            for(i=(n-1);i>=1;i--)
            {
               for(j=1;j<=i;j++)
               {
                  System.out.print("*");
                }
                System.out.println();
            }
        }
        else
        {
            System.out.print("The pattern is not possible");
        }
        sc.close();
    }
}