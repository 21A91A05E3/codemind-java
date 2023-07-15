import java.util.*;
public class evendigit
{
    public static int ised(int n)
    {
        int c=0;
        while(n>0)
        {
            int d=n%10;
            c+=1;
            n=n/10;
        }
        if(c%2==0)return 1;
        else return 0;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int c=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(ised(a[i])==1)c+=1;
        }
        System.out.println(c);
       
    }
}