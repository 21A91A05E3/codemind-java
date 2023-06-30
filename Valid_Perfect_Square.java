import java.util.*;
import java.lang.*;
public class strong
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            double s=Math.sqrt(n);
            s=(int)s;
            if(s*s==n)System.out.println("True");
            else System.out.println("False");
        }
    }
}