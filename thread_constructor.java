class mythr extends thread{
    public mythr(String name){
       super(name);
    }
    public void run(){
        int i=35;
        System.out.println("thank you");
        //while(true){
         //   System.out.println("i am a thread");
        //}
    }
    public void start() {
    }
    public String getname() {
        return null;
    }
    public String getid() {
        return null;
    }
}

public class thread_constructor {
    public static void main(String[] args) {
        mythr t1=new mythr("cee");
        mythr t2 = new mythr("central");
        t1.start();
        t2.start();
        System.out.println("the id of the thread t is" + ((mythr) t1).getid());
        System.out.println("the name of the thread t is" + t1.getname());
        System.out.println("the id of the thread t is" + t2.getid());
        System.out.println("the name of the thread t is" + t2.getname());
    }
    
}
