import java.util.*;
public class strpra
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String ch=sc.nextLine();
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==ch.charAt(0))
            {
                c++;
            }
        }
        if(c!=0)System.out.println(c);
        else System.out.println(-1);
    }
}