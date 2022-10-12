import java.util.Scanner;
class hello
{
    public static void main(String args[])
    {
        int n,odd=0,i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(a[i]%2!=0)
            {
                odd++;
            }
        }
        if(odd<=2)
        {
            System.out.print("YES");
        }
        else
        {
            System.out.print("NO");
        }
    }
}