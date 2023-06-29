import java.util.*;
public class ad
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=n,d;
        while(s>9)
        {
            s=0;
            while(n>0)
            {
                d=n%10;
                s+=d;
                n=n/10;
            }
            n=s;
        }
        System.out.println(n);
      
    }
    
}