import java.util.Scanner;
class Count
{
    public static void main(String args[])
    {
        int n,m,k,c=0,i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        k=sc.nextInt();
        for(i=n;i<=m;i++)
        {
            if(i%k==0)
            {
                c++;
            }
        }
        System.out.print(c);
        sc.close();
    }
}