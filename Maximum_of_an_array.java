import java.util.*;
public class arr
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int res=-10000;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            res=Math.max(res,a[i]);
        }
        System.out.println(res);
    }
}