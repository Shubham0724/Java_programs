class base1{
    base1(){
        System.out.println("i am constructor");
    }
    base1(int x){
        System.out.println("i am overloaded constructor with value of x as: "+x);
    }

}

class derived1 extends base1{
    derived1(){
        //super(0);
        System.out.println("i am a derived class constructor");
    }
    derived1(int x, int y){
        super(x);
        System.out.println("i am an overloaded constructor of derived with value of y as: " + y);
    }
}


public class constructor_inhertance {
    public static void main(String[] args) {
        base1 b= new base1();
        derived1 d=new derived1();
        derived1 e=new derived1(14,9);
        
    }
    
}
