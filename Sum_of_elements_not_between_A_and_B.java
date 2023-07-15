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
        int s=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]>=l && a[i]<=h)continue;
            else s+=a[i];
        }
        System.out.print(s);
        
    }
}