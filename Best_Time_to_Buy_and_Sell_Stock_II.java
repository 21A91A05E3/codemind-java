import java.util.*;
public class stock
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)a[i]=sc.nextInt();
        int m=0;
        for(int i=0;i<n-1;i++)
        {
            if(a[i]<a[i+1])
            {
                m+=a[i+1]-a[i];
            }
        }
        System.out.println(m);
    }
}