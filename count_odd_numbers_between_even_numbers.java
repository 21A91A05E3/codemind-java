import java.util.*;
public class count
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        int c=0;
        for(int i=1;i<=n-2;i++)
        {
            if(a[i]%2==1 &&(a[i-1]%2==0 && a[i+1]%2==0))c+=1;
        }
        System.out.println(c);
    }
}