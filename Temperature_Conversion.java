import java.util.*;
class Conversion
{
    public static void main(String args[])
    {
        float c;
        Scanner sc=new Scanner(System.in);
        c=sc.nextFloat();
        double f=(float)(32+(c*(1.8)));
        System.out.format("%.2f",f);
    }
}