import java.util.*;
public class majority
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            b[i]=a[i]*a[i];
        }
        Arrays.sort(b);
        for(int i=0;i<n;i++) System.out.print(b[i]+" ");
               
    }
}