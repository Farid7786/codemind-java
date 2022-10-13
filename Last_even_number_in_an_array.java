import java.util.Scanner;
class Even
{
    public static void main(String args[])
    {
        int n,i,c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=(n-1);i>=0;i--)
        {
            if(a[i]%2==0)
            {
                c=a[i];
                break;
            }
        }
        System.out.print(c);
        sc.close();
    }
}