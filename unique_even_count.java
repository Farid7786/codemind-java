import java.util.Scanner;
class minimum
{
    public static void main(String args[])
    {
        int n,i,c=0,sum=0,j;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            c=0;
           for(j=0;j<n;j++)
           {
               if(a[i]==a[j] && a[i]!=-1)
               {
                   c++;
               }
           }
           if(c==1)
           {
               if(a[i]%2==0)
               {
                   sum++;
               }
           }
           a[i]=-1;
        }
        System.out.print(sum);
        sc.close();
    }
}