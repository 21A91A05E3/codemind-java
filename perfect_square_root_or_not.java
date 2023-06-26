import java.util.*;
import java.lang.*;
public class psr
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        double r=Math.sqrt(n);
        r=(float)r;
        if(r*r==n)System.out.println("True");
        else System.out.println("False");
    }
}