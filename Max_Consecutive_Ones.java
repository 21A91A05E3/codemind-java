import java.util.*;
import java.lang.Math;
public class majority
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int c=0,m=0;
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        for(int i=0;i<n;i++) 
        {
            if(a[i]==1)c+=1;
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