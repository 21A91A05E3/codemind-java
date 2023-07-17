import java.util.*;
import java.lang.*;
public class monk
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char s[]=str.toCharArray();
        int n=s.length,c=0,m=0;
        for(int i=0;i<n;i++)
        {
            //System.out.print(s[i]);
            if(s[i]=='a'||s[i]=='e'||s[i]=='i'||s[i]=='o'||s[i]=='u')
            c+=1;
            else
            {
                m=Math.max(m,c);
                c=0;
            }
        }
        m=Math.max(m,c);
        System.out.println(m);
    }
}