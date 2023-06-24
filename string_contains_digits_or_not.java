import java.util.*;
public class strpra
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        for(int j=0;j<t;j++)
        {
            String s=sc.nextLine();
            int c=0;
            for(int i=0;i<s.length();i++)
            {
                if(Character.isDigit(s.charAt(i)))
                {
                    c+=1;
                }
            }
            if(c>0)System.out.println("Yes");
            else System.out.println("No");
        }
        
        
    }
}