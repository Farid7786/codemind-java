import java.util.Scanner;
class Maximum
{
    public static void main(String args[])
    {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t>0)
        {
            int n,k,i,c=0;
            n=sc.nextInt();
            int[] a=new int[n];
            for(i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            for(i=0;i<n;i++)
            {
                if(a[i]%2!=0)
                {
                    c++;
                }
            }
            k=c/2;
            System.out.println(k);
            t--;
        }
        sc.close();
    }
}