import java.util.Scanner;
class Even
{
    public static void main(String args[])
    {
        int c;
        double f;
        Scanner sc=new Scanner(System.in);
        c=sc.nextInt();
        f=(double)(c-32)/1.8;
        System.out.format("%.2f",f);
        sc.close();
    }
}