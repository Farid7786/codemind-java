import java.util.Scanner;
class Matrix
{
    public static void main(String args[])
    {
        int n,m,i,j,sum=0,p=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        int[][] a=new int[n][m];
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<n;i++)
        {
            sum=0;
            for(j=0;j<m;j++)
            {
                sum=sum+a[i][j];
            }
            System.out.print(sum+" ");
        }
        sc.close();
    }
}