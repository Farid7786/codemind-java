import java.util.Scanner;
class minimum
{
    public static void main(String args[])
    {
        int n,i,j,sum=0,d,e,m=0,c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        d=sc.nextInt();
        e=sc.nextInt();
        for(i=0;i<n;i++)
        {
          if(a[i]>=d && a[i]<=e)
          {
              m++;
          }
          else
          {
              System.out.print(a[i]+" ");
              c++;
          }
        }
        if(c==0)
        {
            System.out.print("-1");
        }
        sc.close();
    }
}