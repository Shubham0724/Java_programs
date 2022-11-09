class employee{
    int id;
    int salary;
    String name;
    public void printdetails(){
        System.out.println("my id is " + id);
        System.out.println("and my name is " + name);
    }

    public int getSalary(){
        return salary;

    }

}


public class class_ {
    public static void main(String[] args) {
        System.out.println("this is custom class");
        employee central = new employee();
        employee lil = new employee();

        central.id =11;
        central.salary = 34;
        central.name ="central_cee";

        lil.id =13;
        lil.salary = 44;
        lil.name ="lil_baby";

        central.printdetails();
        lil.printdetails();
        int salary = lil.getSalary();
        System.out.println(salary);
        System.out.println(central.id);
        System.out.println(central.name);
        System.out.println(central.salary);



    }
    
}
