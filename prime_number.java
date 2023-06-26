import java.util.*;
import java.lang.*;
public class prime
{
    public static int p(int n)
    {
        for(int i=2;i<n/2;i++)
        {
            if(n%i==0)return 0;
        }return 1;
    }
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(p(n)==1)System.out.println("prime");
        else System.out.println("not a prime");
    }
}