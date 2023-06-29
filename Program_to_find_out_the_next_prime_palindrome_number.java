import java.util.*;
import java.lang.*;
public class pro
{
    public static int isprime(int n)
    {
        if(n<=1)return 0;
        for(int i=2;i<=Math.sqrt(n);i++)
        if(n%i==0)return 0;
        return 1;
    }
    public static int palin(int n)
    {
        int d,res=0,t=n;
        while(n>0)
        {
            d=n%10;
            res=(res*10)+d;
            n=n/10;
        }
        if(res==t)return 1;
        return 0;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int i=l+1;
        while(true)
        {
            if(palin(i)==1 && isprime(i)==1)
            {
                System.out.println(i);
                break;
            }
            else
            {
                i++;
            }
        }
    }
    
}