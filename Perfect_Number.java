import java.util.*;
public class perfect
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=n,d,s=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)s+=i;
        }
        if(s==t)System.out.println("True");
        else System.out.println("False");
        
    }
}