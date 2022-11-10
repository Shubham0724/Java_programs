class myemployee{
    private int id;
    private String name;

    public String getname(){
        return name;
    }
    public void setname(String n){
        this.name = n;
    }
    public void setid(int t){
        this.id = i;
    }
    public int getid(){
        return id;
    } 
}


public class accses_modifier {
    public static void main(String[] args) {
        myemployee central = new myemployee();
        central.id =45;
        central.name ="centralcee";
        central.setname("centralcee");
        System.out.println(central.getname());
        central.setid(234);
        System.out.println(central.getid());
    }
    
}
