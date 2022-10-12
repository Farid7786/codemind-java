import java.util.Scanner;
import java.lang.Math;
class hello
{
    public static void main(String args[])
    {
        double a,b,c,s,d,area;
        Scanner sc=new Scanner(System.in);
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
        s=(a+b+c)/2;
        d=(s*(s-a)*(s-b)*(s-c));
        area=Math.sqrt(d);
        System.out.format("%.2f",area);
    }
}