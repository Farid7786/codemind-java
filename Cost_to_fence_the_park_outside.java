import java.util.Scanner;
class Descending
{
    public static void main(String args[])
    {
        int l,b,c,a,w;
        Scanner sc=new Scanner(System.in);
        l=sc.nextInt();
        b=sc.nextInt();
        w=sc.nextInt();
        c=sc.nextInt();
        a=((l+2*w)*(b+2*w)-l*b);
        System.out.println(a*c);
        sc.close();
    }
}
        