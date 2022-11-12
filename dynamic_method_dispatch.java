class phone{
    public void showtime(){
        System.out.println("time is 8 am");
    }
    public void on(){
        System.out.println("turning on phhone...");
    }

}

class smartphone extends phone{
    public void music(){
        System.out.println("playing music...");
    }
    public void on(){
        System.out.println("turning on smartphhone...");
    }

}

public class dynamic_method_dispatch {
    public static void main(String[] args) {
        // phone obj = new phone();  // allowed
        //smarthone smobj = new smartphone(); // allowed
        //obj.name();
        
        phone objPhone= new smartphone() ;  // yes it is allowed
        //smartphone obj2= new phone(); //not allowed

        phone obj;
        obj.showtime();
        obj.on();
        // obj.music(); not allowed
            
        };
    }
    

