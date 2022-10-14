import java.util.Scanner;
class Descending
{
    public static void main(String args[])
    {
        int n,i,j,c=0,m=0,k,s;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        s=sc.nextInt();
        for(i=0;i<n;i++)
        {
            c=0;
            k=a[i];
            for(j=1;j<=k;j++)
            {
                if(k%j==0)
                {
                    c++;
                }
            }
            if(c==2)
            {
                if(a[i]<=s)
                {
                    m++;
                }
            }
        }
        System.out.print(m);
    }
}