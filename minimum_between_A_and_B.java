import java.util.Scanner;
class Minimum
{
    public static void main(String args[])
    {
        int n,i,d,e,c=0,sum=100000;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        d=sc.nextInt();
        e=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(a[i]>=d && a[i]<=e)
            {
                if(a[i]<=sum)
                {
                    sum=a[i];
                    c++;
                }
            }
        }
        if(c==0)
        {
            System.out.println("-1");
        }
        else
        {
            System.out.println(sum);
        }
        sc.close();
    }
}