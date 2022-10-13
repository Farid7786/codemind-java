import java.util.Scanner;
class Even
{
    public static void main(String args[])
    {
        int n,i,sum=100000;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(a[i]<=sum)
            {
              sum=a[i];
            }
        }
        System.out.print(sum);
        sc.close();
    }
}