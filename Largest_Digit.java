import java.util.Scanner;
class Table
{
    public static void main(String args[])
    {
        int n,r,sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n>0)
        {
            r=n%10;
            if(r>=sum)
            {
                sum=r;
            }
            n=n/10;
        }
        System.out.println(sum);
        sc.close();
    }
}