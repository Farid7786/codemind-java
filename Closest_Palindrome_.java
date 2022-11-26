import java.util.Scanner;
class hello
{
    public static void main(String args[])
    {
        int n,i,sum=0,h,r,copy=0,rem,cpy=0,add,k,j,sub,min,l;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        l=n;
        for(i=n-1;i>0;i--)
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
                copy=i;
                break;
            }
        }
        for(j=n+1;j>n;j++)
        {
            k=j;
            add=0;
            while(k>0)
            {
                rem=k%10;
                add=add*10+rem;
                k=k/10;
            }
            if(j==add)
            {
                cpy=j;
                break;
            }
        }
        sub=l-copy;
        min=cpy-l;
        if(sub>min)
        {
            System.out.println(cpy);
        }
        else if(sub==min)
        {
            System.out.println(copy+" "+cpy);
        }
        else
        {
            System.out.println(copy);
        }
    }
}