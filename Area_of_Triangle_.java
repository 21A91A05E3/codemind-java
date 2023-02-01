import java.util.*;
import java.lang.Math;
class Area
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        float s,r;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        s=(float)(a+b+c)/2;
        r=(float)s*(s-a)*(s-b)*(s-c);
        System.out.format("%.2f",Math.sqrt(r));
        
    }
}