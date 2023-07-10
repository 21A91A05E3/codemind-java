import java.util.*;
public class arr
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=0;
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(a[i]==k)res+=1;
        }
        if(res==0)System.out.println("False");
        else System.out.println("True");
    }
}