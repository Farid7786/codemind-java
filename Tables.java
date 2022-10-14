import java.util.Scanner;
class Table
{
    public static void main(String args[])
    {
        int n,m,i,k;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        for(i=1;i<=m;i+=2)
        {
            k=n*i;
            System.out.println(n+" x "+i+" = "+k);
        }
        sc.close();
    }
}