import java.util.Scanner;
class hello
{
    public static void main(String args[])
    {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t>0)
        {
            int a,b,c,d;
            float f,e;
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            d=sc.nextInt();
            f=(float)c/a;
            e=(float)d/b;
            if(f<e)
            {
                System.out.println("-1");
            }
            else if(f>e)
            {
                System.out.println("1");
            }
            else if(f==e)
            {
                System.out.println("0");
            }
            t--;
        }
    }
}