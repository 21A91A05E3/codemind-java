import java.util.*;
public class hw
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int b[]=new int[m];
        for(int i=0;i<m;i++)
        {
            b[i]=sc.nextInt();
        }
        int q=sc.nextInt();
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]<=q && b[i]>=q)c+=1;
        }
        System.out.println(c);
    }
}