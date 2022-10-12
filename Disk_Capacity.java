import java.util.Scanner;
class hello
{
    public static void main(String args[])
    {
        int a,b,c,d,e,f;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=(c*512);
        e=d*b;
        f=e*a;
        System.out.print(2*f);
    }
}