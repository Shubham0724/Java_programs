import java.net.NetworkInterface;

interface mycamera{
    void takesnap();
    void recoredvideo();
    private void greet(){
        System.out.println("good morning");
    }
    default void record4Kvideo(){
        greet();
        System.out.println("recording in 4k.....");
    }
}

interface mywifi{
    String[] getnetworks();
    void connecttonetwork(String  network);
}

class mycellphone{
    void callnumber(int phonenumber){
        System.out.println("calling "+ phonenumber);
    }
    void pickcall(){
        System.out.println("connecting......");
    }
}

class mysmartphone extends mycellphone implements mywifi , mycamera{
    public void takesnap(){
        System.out.println("taking snap");
    }
    public void recoredvideo(){
        System.out.println("taking snap");
    }
    //public void record4Kvideo(){
      //  System.out.println("taking snap and recoding in 4k");
    //}
    public String[] getnetwork(){
        System.out.println("getting list of networks");
        String[] networklist = {"sam", "tom","kity"};
        return networklist;
    }
    public void connecttonetwork(String network){
        System.out.println("connecting to" + network);
    }
    public void samplemeth(){
        System.out.println("meth");
    }

    
}

public class polymorphism {
    public static void main(String[] args) {
        mycamera cam1 = new mysmartphone();

        cam1.record4Kvideo();

        mysmartphone s= new mysmartphone();
        s.samplemeth();
        s.recoredvideo();
        s.getnetwork();
        s.callnumber(7777);
    }
    
}
