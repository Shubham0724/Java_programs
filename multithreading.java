class thread{
    public static Object max_priority;
    public static Object min_priority;

    public thread() {
    }

    public thread(String name) {
    }

    public static void main(String[] args) {
       // func1();
       // func2();

    }
}

class multi extends thread{
    public multi(String name) {
        super(name);
        //TODO Auto-generated constructor stub
    }
    public void run(){
        System.out.println("thread is running....");
    }
    public static void main(String args[]){
        multi func1=new multi(null);
        //func1.start();
        multi func2=new multi(null);
        //func2.start();

    }

}


/*

class mythread extends thread{
    @Override
    public void run(){
        int i=0;
        while(i<40000){
            System.out.println("my cooking thread is running");
            System.out.println("i am happy!");
            i++;
        }
    }

}

class mythread2 extends thread{
    @Override
    public void run(){
        int i=0;
        while(i<40000){
            System.out.println("thread 2 for chatting with her");
            System.out.println("i am sad!");
            i++;
        }
    }
}
public class multithreading {
    public static void main(String[] args) {
        mythread1 t1 = new mythread1();
        mythread2 t2 = new mythread2();
        t1.start();
        t2.start();
    }
    
}

*/