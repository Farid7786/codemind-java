import java.util.Scanner;
class Table
{
    public static void main(String args[])
    {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t>0)
        {
            int a,b;
            a=sc.nextInt();
            b=sc.nextInt();
            System.out.println(a+b);
            t--;
        }
        sc.close();
    }
}