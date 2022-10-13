import java.util.Scanner;
class Average
{
    public static void main(String args[])
    {
        int n,i,j,c=0,sum=0;
        int avg;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            sum=sum+a[i];
        }
        avg=sum/n;
        for(i=0;i<n;i++)
        {
            if(a[i]>=avg)
            {
                c++;
            }
        }
        System.out.print(c);
        sc.close();
    }
}