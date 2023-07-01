import java.util.*;
public class palin
{
    public static int ispalin(int n)
    {
        int d,r=0,t=n;
        while(n>0)
        {
            d=n%10;
            r=r*10+d;
            n=n/10;
        }
        if(r==t)return 1;
        else return 0;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            if(ispalin(n)==1)System.out.println("True");
            else System.out.println("False");
        }
    }
}