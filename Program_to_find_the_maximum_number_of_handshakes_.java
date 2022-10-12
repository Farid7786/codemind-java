import java.util.Scanner;
class hello
{
    public static void main(String args[])
    {
        int n,b;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        b=n*(n-1)/2;
        System.out.print(b);
    }
}