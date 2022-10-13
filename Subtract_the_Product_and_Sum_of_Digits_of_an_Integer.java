import java.util.Scanner;
class Count
{
    public static void main(String args[])
    {
        int n,p=1,sum=0,r;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n>0)
        {
            r=n%10;
            p=p*r;
            sum=sum+r;
            n=n/10;
        }
        if(sum>p)
        {
            System.out.print(sum-p);
        }
        else
        {
            System.out.print(p-sum);
        }
    }
}