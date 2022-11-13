abstract class parent2{
    public parent2(){
        System.out.println("i am base2 class constructor");
    }
    public void sayhello(){
        System.out.println("hello");
    }
    abstract public void greet();
    abstract public void greet2();
    
}

class child2 extends parent2{
    @Override
    public void greet(){
        System.out.println("good morning");
    }
    @Override
    public void greet2(){
        System.out.println("good aftenoon");
    }
}

abstract class child3 extends parent2{
    public void th(){
        System.out.println("i am good");
    }
}


public class abstract_class {
    public static void main(String[] args) {
        //parent2 p = new parent2(); ---error
        child2 c = new child2();
        
    }
    
}
