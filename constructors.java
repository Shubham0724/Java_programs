class employee{
    //first constructor
    employee(String s, int i){
        System.out.println("the name of the first employee is :" + s);
        System.out.println("the id of the first employee is :" + i);

    }

    // constuctor overloading
    employee(String s,int i, int salary){
        System.out.println("the name of the second employe is :" +s);
        System.out.println("the id of the second  employee is:"+i);
        System.out.println("the salary of second  employee is:"+ salary);

    }
}


public class constructors {
    public static void main(String[] args) {
        employee shubham = new employee("shubham",1);
        employee central = new employee("central",2,70000);
    }
    
}
