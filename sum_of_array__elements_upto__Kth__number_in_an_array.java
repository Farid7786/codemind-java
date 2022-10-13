import java.util.Scanner;
class minimum
{
    public static void main(String args[])
    {
        int n,i,k,sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        k=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(i>=k)
            {
                break;
            }
            else
            {
                sum=sum+a[i];
            }
        }
        System.out.print(sum);
        sc.close();
    }
}