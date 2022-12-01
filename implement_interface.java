import java.io.*;

interface shape
{
    final float pi=3.14f;
    public void area();
}
class circle implements shape{
    int r;
    circle(int r)

    {
        this.r=r;
    }
    public void area()
    {
        System.out.println("area of circle= " +(pi*r*r));
    }
}

class sphere implements shape{
    int r;
    sphere(int r)

    {
        this.r=r;
    }
    public void area()
    {
        System.out.println("area of circle= " +(4*pi*r*r));
    }

}


public class implement_interface {
    public static void main(String[] args) throws IOException
    {
        BufferedReader=new BufferedReader(new InputStreamReader(System.in));

        int r;
        System.out.println("enter radius of circle= ");
        r=Integer.parsent(br.readLine());
    

        shape s;
        s=new circle(r);
        s.area();
        System.out.println("enter the radius for sphere");
        r=Integer.parseInt(br.readLine());
        s=new sphere(r);
        s.area();
    }
    
}
