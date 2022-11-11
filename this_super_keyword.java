import javax.crypto.interfaces.PBEKey;
import javax.print.Doc;
class oneclass{
    int a;
    public int geta(){
        return a;
    }
    oneclass(int a){
        this.a=a;
    }
    public int returnone(){
        return 1;
    }
}
class twoclass extends oneclass{ twoclass(int c){super(c);
System.out.println("i am constructor");}
}

public class this_super_keyword {
    public static void main(String[] args) {
        oneclass e= new oneclass(65);
        twoclass d= new twoclass(5);
        System.out.println(e.geta());
    }
    
}
