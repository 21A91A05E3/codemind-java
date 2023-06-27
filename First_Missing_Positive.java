import java.util.*;
public class first
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
        int b[]=new int[1000];
        for(int i=0;i<n;i++)
        {
            if(a[i]>=0)b[a[i]]++;
        }
        for(int i=1;i<10000;i++)
        {
            if(b[i]==0)
            {
                System.out.println(i);
                break;
            }
        }
    }
}