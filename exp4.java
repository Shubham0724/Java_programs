public class exp4 {
    
    /*
    void sum(int a, int b)
    {
        System.out.println("sum is " +(a+b));
    }
    void sum(double a, double b)
    {
        System.out.println("sum is " +(a+b));
    }
    public static void main(String[] args) {
        exp4 cal = new exp4();
        cal.sum(7,9);
        cal.sum(5.3,2.5);
    }

    

    int value1;
    int value2;
    exp4()
    {
        value1= 10;
        value2=20;
    }
    exp4(int a)
    {
        value1=value2=a;
    }
    exp4(int a, int b)
    {
        value1=a;
        value2=b;
    }
    void display()
    {
        System.out.println("value1= "+value1);
        System.out.println("value2= "+value2);
    }

    */

    
        public static void main(String[] args) {
            exp4 e1= new exp4();
            exp4 e2= new exp4(10);
            exp4  e3= new exp4(30,40);
            e1.display();
            e2.display();
            e3.display();

        
    }
    
}
