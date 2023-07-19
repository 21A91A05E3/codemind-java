import java.util.*;
import java.lang.Math;
public class majority
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        int k=sc.nextInt();
        int i=0,j=n-1,f=-1,l=-1;
        while(i<=j)
        {
            if(f>=0 && l>=0)break;
            if(a[i]==k)f=i;
            else i++;
            if(a[j]==k)l=j;
            else j--;
        }
        System.out.print(f+" "+l);
    }
}