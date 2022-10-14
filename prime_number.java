import java.util.Scanner;
class Table
{
    public static void main(String args[])
    {
        int n,c=0,i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=2;i<n;i++)
        {
            if(n%i==0)
            {
                c++;
            }
        }
        if(c==0)
        {
          System.out.println("prime");   
        }
        else
        {
            System.out.println("not a prime");
        }
        sc.close();
    }
}