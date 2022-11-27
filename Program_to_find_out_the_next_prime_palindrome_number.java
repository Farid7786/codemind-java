import java.util.Scanner;
class hello
{
    public static void main(String args[])
    {
        int n,i,c,sum,r,j,h;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=n+1;i>n;i++)
        {
            sum=0;
            h=i;
            while(h>0)
            {
                r=h%10;
                sum=sum*10+r;
                h=h/10;
            }
            if(i==sum)
            {
                c=0;
                for(j=1;j<=i;j++)
                {
                    if(i%j==0)
                    {
                        c++;
                    }
                }
                if(c==2)
                {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}