import java.util.Scanner;

class rect{
    private double w,l,a;
    private String colour;
    Scanner d=new Scanner(System.in);
    void get_length()
    {
        System.out.println("enter the length");
        l=d.nextDouble();
    }
    
    void get_width()
    {
        System.out.println("enter the width");
        w=d.nextDouble();
    }
    void get_colour()
    {
        System.out.println("enter the colour");
        colour=d.next();
    }
    double find_area()
    {
        a=w*l;
        return a;
    }
    String show_colour()
    {
        return colour;
    }
}

public class exp3 {
    public static void main(String[] args) {
        rect r1=new rect();
        rect r2=new rect();
        System.out.println("first rectangle");
        r1.get_length();
        r1.get_width();
        r1.get_colour();
        System.out.println("second rectangle");
        r2.get_length();
        r2.get_width();
        r2.get_colour();
        String c1=r1.show_colour();
        String c2=r2.show_colour();
        if((r1.find_area()==r2.find_area())&&(c1.compareTo(c2)==0))
                System.out.println("matching rectangle");
        else
                System.out.println("not matching rectangles");        
    }

    
}
