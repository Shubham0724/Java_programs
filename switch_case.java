import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {
        
        int age;
        System.out.println("Enter your age");
        Scanner sc = new Scanner(System.in);
        age= sc.nextInt();

        switch(age){
            case 18:
                System.out.println("You are going to become an adult!");
                break;
            case 23:
                System.out.println("You are going to join a job!");
                break;
            case 60:
                System.out.println("You are going to get retired!");
                break;
            default:
                System.out.println("Enjoy your life!");
        }
        System.out.println("java is best!!");


        /*
        if (age>56){
            System.out.println("You are experienced!");
        }
        else if (age>46){
            System.out.println("You are semi-experienced!");
        }
        else if (age>36){
            System.out.println("You are semi-semi-experienced!");
        }
        else {
            System.out.println("You are not experienced!");
        }
        //if (age>2){
        //    System.out.println("you are not baby!");
       // }
       */
    }
    
}
