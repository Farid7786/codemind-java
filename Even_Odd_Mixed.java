import java.util.Scanner;
class Maximum
{
    public static void main(String args[])
    {
        int n,e=0,o=0,m=0,sum=0,r;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n>0)
        {
            r=n%10;
            if(r%2==0)
            {
                e++;
            }
            else if(r%2!=0)
            {
                o++;
            }
            else
            {
                m++;
            }
            sum++;
            n=n/10;
        }
        if(sum==e)
        {
           System.out.print("Even");
        }
        else if(sum==o)
        {
            System.out.print("Odd");
        }
        else
        {
            System.out.print("Mixed");
        }
        sc.close();
    }
}