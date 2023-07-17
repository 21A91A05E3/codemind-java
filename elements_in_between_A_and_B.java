import java.util.*;
public class oddeven
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
        int l=sc.nextInt();
        int h=sc.nextInt();
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]>=l && a[i]<=h)
            {
                c+=1;
                System.out.print(a[i]+" ");
            }
        }
        if(c==0)System.out.print(-1);
        
    }
}