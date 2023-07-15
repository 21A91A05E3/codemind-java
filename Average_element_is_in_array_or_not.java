import java.util.*;
public class oddeven
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int s=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            s+=a[i];
        }
        int avg=s/n;
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]==avg)
            {
                c+=1;
                break;
            }
        }
        if(c!=0)System.out.print("True");
        else System.out.print("False");
        
    }
}