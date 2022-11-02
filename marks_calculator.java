import java.util.Scanner;
public class marks_calculator {
    public static void main(String[] args) {
        System.out.println("Enter your marks of 5 subjects");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first subject marks");
        float  a =  sc.nextFloat();
        System.out.println("Enter second subject marks");
        float  b =  sc.nextFloat();
        System.out.println("Enter third subject marks");
        float  c =  sc.nextFloat();
        System.out.println("Enter fourth subject marks");
        float  d =  sc.nextFloat();
        System.out.println("Enter fifth subject marks");
        float  e =  sc.nextFloat();
        System.out.println("Your percentage is");
        float total = (a+b+c+d+e);
        float percentage = (total/500)*100;
        System.out.println(percentage);

    }


    
}
