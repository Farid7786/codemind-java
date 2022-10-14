import java.util.Scanner;
import java.lang.Math;
class Seasons
{
    public static void main(String args[])
    {
        int n,x=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n!=1)
        {
            if(n%2==0)
           {
              n=n/2;
           }
           else if(n%3==0)
           {
              n=n/3;
           }
           else if(n%5==0)
           {
                 n=n/5;
           }
           else
           {
               System.out.println("Not Ugly Number");
               x=x+1;
               break;
           }
        }
        if(x==0)
        {
            System.out.println("Ugly Number");
        }
        sc.close();
    }
}