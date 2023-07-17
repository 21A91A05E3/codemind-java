import java.util.*;
import java.lang.*;
public class monk
{
    public static int ispalin(char s[],int n)
    {
        int i=0,j=n-1;
        while(i<=j)
        {
            if(s[i]!=s[j])return 0;
            i+=1;
            j-=1;
        }
        return 1;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t>0)
        {
        String str=sc.next();
        char s[]=str.toCharArray();
        int n=s.length;
        if(ispalin(s,n)==1)
        {
            if(n%2==0)System.out.println("YES EVEN");
            else System.out.println("YES ODD");
        }
        else
        {
            System.out.println("NO");
        }
        t-=1;
        }
    }
}