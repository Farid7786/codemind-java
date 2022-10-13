import java.util.Scanner;
class Count
{
    public static void main(String args[])
    {
        int a,b,i,gcd=0;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=1;i<=a && i<=b;i++)
        {
            if(a%i==0 && b%i==0)
            {
                gcd=i;
            }
        }
        System.out.print(gcd);
        sc.close();
    }
}