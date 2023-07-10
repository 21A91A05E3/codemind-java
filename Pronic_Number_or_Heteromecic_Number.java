import java.util.*;
public class pronic
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1,c=0;
        while(i<=n/2)
        {
            if(i*(i+1)==n)
            {
                c+=1;
                break;
            }
            else i+=1;
            
        }
        if(c==1)System.out.println("YES");
        else System.out.println("NO");
    }
}