import java.util.Scanner;
class Even
{
    public static void main(String args[])
    {
        int n,i,c=0,sum=0;
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
            if(avg==a[i])
            {
                c++;
            }
        }
        if(c==0)
        {
            System.out.print("False");
        }
        else
        {
            System.out.print("True");
        }
        sc.close();
    }
}