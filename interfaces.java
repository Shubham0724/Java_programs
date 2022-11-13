interface bicycle{
    int a=45;
    void applybreak(int decrement);
    void speedup(int increment);
}

interface hornbicycle{
    void blowhornk3g();
    void blowhornhn();
}

class avoncycle implements bicycle,hornbicycle{
    void blowhorn(){
        System.out.println("pee pee peep");
    }
    public void applybreak(int decrement){
        System.out.println("applying break");
    }
    @Override
    public void blowhornk3g() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void blowhornhn() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void speedup(int increment) {
        // TODO Auto-generated method stub
        
    }
}
public class interfaces {
    public static void main(String[] args, int decrement) {
        avoncycle cyclecentral = new avoncycle();
        cyclecentral.applybreak(decrement);
        System.out.println(cyclecentral.a);
    }
    
}
