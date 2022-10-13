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
            int n,i,c=0,k;
            n=sc.nextInt();
            for(i=1;i<=n;i++)
            {
                k=i*i;
                if(k==n)
                {
                    c++;
                }
            }
            if(c==0)
            {
                System.out.println("False");
            }
            else
            {
                System.out.println("True");
            }
            t--;
        }
        sc.close();
    }
}