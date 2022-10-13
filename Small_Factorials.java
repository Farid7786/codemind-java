import java.util.Scanner;
class Count
{
    public static void main(String args[])
    {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t>0)
        {
            int n,k=1,i;
            n=sc.nextInt();
            for(i=1;i<=n;i++)
            {
                k=k*i;
            }
            System.out.println(k);
            t--;
        }
    }
}