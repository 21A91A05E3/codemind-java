import java.util.*;
public class factorial
{
    public static int fact(int n)
    {
        if(n<=1)return 1;
        else return n*fact(n-1);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
           System.out.println(fact(n));
        }
    }
}