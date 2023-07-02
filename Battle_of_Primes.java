import java.util.*;
import java.lang.*;
public class primes
{
    public static int isprime(int n)
    {
        if(n<=1)return 0;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)return 0;
        }
        return 1;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int s=a+b,p=0;
        for(int i=s+1;i<=s+100;i++)
        {
            if(isprime(i)==1)
            {
                p=i;
                break;
            }
        }
        System.out.println(p-s);
    }
}