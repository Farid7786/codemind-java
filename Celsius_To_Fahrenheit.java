import java.util.Scanner;
class Maximum
{
    public static void main(String args[])
    {
        int c;
        double f;
        Scanner sc=new Scanner(System.in);
        c=sc.nextInt();
        f=(double)(c*1.8)+32;;
        System.out.format("%.2f",f);
        sc.close();
    }
}