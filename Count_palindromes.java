import java.util.Scanner;
class count
{
    public static boolean pali(int k)
    {
        int p,r,sum=0;
        p=k;
        while(k>0)
        {
            r=k%10;
            sum=sum*10+r;
            k=k/10;
        }
        if(p==sum)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String args[])
    {
        int n,i,c=0,k;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            k=a[i];
            if(pali(k))
            {
                c++;
            }
        }
        System.out.print(c);
        sc.close();
    }
}