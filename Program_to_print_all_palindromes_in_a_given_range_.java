import java.util.*;
public class palin
{
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
        int r=sc.nextInt();
        for(int i=l;i<=r;i++)
        {
            if(palin(i)==1)
            {
                System.out.print(i+" ");
            }
        }
    }
    
}