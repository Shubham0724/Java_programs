class mythr1 extends thread{
    public mythr1(String name){
        super();
    }
    public void run(){
        int i=34;

        while(true){
            System.out.println("thank you: "+this.getName());
        }
    }
    private String getName() {
        return null;
    }
    public void setpriority(Object max_priority) {
    }
    public void start() {
    }
}

public class thread_priorities {
    public static void main(String[] args) {
        //ready queue : t1 t2 t3 t4 t5
        mythr1 t1 = new mythr1("central1");
        mythr1 t2 = new mythr1("central2");
        mythr1 t3 = new mythr1("central3");
        mythr1 t4 = new mythr1("central4");
        mythr1 t5 = new mythr1("central5 (most important)");
        t5.setpriority(thread.max_priority);
        t1.setpriority(thread.min_priority);
        t2.setpriority(thread.max_priority);
        t3.setpriority(thread.max_priority);
        t4.setpriority(thread.max_priority);
        t5.setpriority(thread.max_priority);


        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        

    }


    
}
