import java.util.*;
public class majority
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[1000];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            b[a[i]]++;
        }
        for(int i=0;i<n;i++)
        {
            if(b[a[i]]>n/2)
            {
                System.out.println(a[i]);
                break;
            }
        }
    }
}