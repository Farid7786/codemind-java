import java.util.Scanner;
class Table
{
    public static void main(String args[])
    {
        int n,r,sum=0,i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        if(sum>n)
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