import java.util.Scanner;
class hello
{
    public static void main(String args[])
    {
        int r;
        double c;
        Scanner sc=new Scanner(System.in);
        r=sc.nextInt();
        c=3.14*r*r;
        System.out.format("%.2f",c);
    }
}