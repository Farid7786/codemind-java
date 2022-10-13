import java.util.Scanner;
class Maximum
{
    public static void main(String args[])
    {
        int n,k;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        k=(n*(n-3)/2);
        System.out.print(k);
        sc.close();
    }
}