import java.util.Scanner;
class Table
{
    public static void main(String args[])
    {
        int n,i,c=0,k;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<n;i++)
        {
            k=i*i;
            if(n==k)
            {
                c++;
                break;
            }
        }
        if(c==0)
        {
          System.out.println("False");   
        }
        else
        {
            System.out.println("True");
        }
        sc.close();
    }
}