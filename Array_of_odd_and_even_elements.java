import java.util.*;
public class oddeven
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int e=0,o=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]%2==0)e+=1;
            else o+=1;
        }
        int ae[]=new int[e];
        int ao[]=new int[o];
        int k=0,l=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]%2==0)ae[k++]=a[i];
            else ao[l++]=a[i];
        }
        for(int it:ao)System.out.print(it+" ");
        for(int it:ae)System.out.print(it+" ");
        
    }
}