import java.util.Scanner;
class Count
{
    public static void main(String args[])
    {
        int n,l,k,i,sum=0,r;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        l=n;
        k=n*n;
        while(k>0)
        {
            r=k%10;
            sum=sum+r;
            k=k/10;
        }
        if(sum==l)
        {
            System.out.print("Neon Number");
        }
        else
        {
            System.out.print("Not Neon Number");
        }
        sc.close();
    }
}