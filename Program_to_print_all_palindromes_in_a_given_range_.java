import java.util.Scanner;
class Count
{
    public static void main(String args[])
    {
        int n,m,k,sum=0,i,r;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        for(i=n;i<=m;i++)
        {
            sum=0;
            k=i;
            while(k>0)
            {
                r=k%10;
                sum=sum*10+r;
                k=k/10;
            }
            if(sum==i)
            {
                System.out.print(sum+" ");
            }
        }
        sc.close();
    }
}