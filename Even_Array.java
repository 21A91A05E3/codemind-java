import java.util.*;
public class evenarray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int c=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]%2==0)c+=1;
        }
        if(c==n)System.out.println("True");
        else System.out.println("False");
    }
}