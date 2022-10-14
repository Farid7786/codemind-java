import java.util.Scanner;
class Table
{
    public static void main(String args[])
    {
        int n,r,sum=0,k,l=0,p;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        k=n*n;
        while(n>0)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        p=sum*sum;
        while(p>0)
        {
            r=p%10;
            l=l*10+r;
            p=p/10;
        }
        if(l==k)
        {
          System.out.println("True");   
        }
        else
        {
            System.out.println("False");
        }
        sc.close();
    }
}