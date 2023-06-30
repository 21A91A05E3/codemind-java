import java.util.*;
public class strong
{
    public static int fact(int n)
    {
        if(n<=1)return 1;
        else return n*fact(n-1);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=n,d,s=0;
        while(n>0)
        {
            d=n%10;
            s+=fact(d);
            n=n/10;
        }
        if(s==t)System.out.println("The number "+t+" is a strong number");
        else System.out.println("The number "+t+" is not a strong number");
        
    }
}