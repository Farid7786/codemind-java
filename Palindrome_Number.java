import java.util.Scanner;
class Count
{
    public static void main(String args[])
    {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
         while(t>0)
         {
             int n,r,sum=0,k;
             n=sc.nextInt();
             k=n;
             while(n>0)
             {
                 r=n%10;
                 sum=sum*10+r;
                 n=n/10;
             }
             if(sum==k)
             {
                 System.out.println("True");
             }
             else
             {
                 System.out.println("False");
             }
             t--;
         }
         sc.close();
    }
}