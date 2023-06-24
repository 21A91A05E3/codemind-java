import java.util.*;
public class digit
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i)))
            {
                c+=s.charAt(i)-'0';
            }
        }
        System.out.println(c);
        
    }
}