import java.util.*;
public class EOM
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d,e=0,o=0;
        while(n>0)
        {
            d=n%10;
            if(d%2==0)e+=1;
            else o+=1;
            n=n/10;
        }
        if(e>0 && o>0)System.out.println("Mixed");
        else if(e==0)System.out.println("Odd");
        else System.out.println("Even");
      
    }
    
}