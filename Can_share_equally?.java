import java.util.Scanner;
class Maximum
{
    public static void main(String args[])
    {
        int x,y,z;
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        z=x+y*2;
        if(x==0 && y%2==0)
        {
            System.out.print("YES");
        }
        else if(x==0 && y%2!=0)
        {
            System.out.print("NO");
        }
        else if(z%2==0)
        {
            System.out.print("YES");
        }
        else
        {
            System.out.print("NO");
        }
        sc.close();
    }
}