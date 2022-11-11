class base{
    public int x;
    public int setx;
    public int getx(){
        return x;
    }

    public void setx(){
        System.out.println("i am in base and setting x now");
        this.x=x;
    }
    public void printme(){
        System.out.println("i am a consrtuctor");
    }
}

class derived extends base{
    public int y;

    public int gety(){
        return y;
    }
    public void sety(int y){
        this.y=y;
    }
}



public class inheritence {
    public static void main(String[] args) {
        //creating an object of base class
        base b=new base();
        b.setx(4);
        System.out.println(b.getx());

        //creating an object of derived class
        derived d= new derived();
        d.sety(43);
        System.out.println(d.gety());
    }
    
}
