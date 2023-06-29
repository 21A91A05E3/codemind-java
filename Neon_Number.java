import java.util.*;
public class neon
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sq=n*n;
        int d,s=0;
        while(sq>0)
        {
            d=sq%10;
            s+=d;
            sq=sq/10;
        }
        if(s==n)System.out.println("Neon Number");
        else System.out.println("Not Neon Number");
        
    }
    
}