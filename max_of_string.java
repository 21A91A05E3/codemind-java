import java.util.*;
public class strpra
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char arr[]=s.toCharArray();
        char ch='a';
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>ch)
            {
                ch=arr[i];
            }
        }
        System.out.println(ch);
    }
}