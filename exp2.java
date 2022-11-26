import java.util.Scanner;

public class exp2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int choice;
        int a,b,i,fact;
        do
        {
            System.out.println("1:ADDITION");
            System.out.println("2:SUBTRACTION");
            System.out.println("3:MULTIPLICATION");
            System.out.println("4:DIVISION");
            System.out.println("5:FCATORIAL");
            System.out.println("ENTER YOUR CHOICE");
            choice=sc.nextInt();
            switch(choice)
            {
              case 1:
                    System.out.println("enter two number=");
                    a=sc.nextInt();
                    b=sc.nextInt();
                    System.out.println("addition of two numbers= "+(a+b));
                    break;
                    
              case 2:
                    System.out.println("enter two number=");
                    a=sc.nextInt();
                    b=sc.nextInt();
                    System.out.println("subtraction of two numbers= "+(a-b));
                    break; 
              
             case 3:
                    System.out.println("enter two number=");
                    a=sc.nextInt();
                    b=sc.nextInt();
                    System.out.println("multiplication of two numbers= "+(a*b));
                    break; 
                    
             case 4:
                    System.out.println("enter two number=");
                    a=sc.nextInt();
                    b=sc.nextInt();
                    System.out.println("division of two numbers= "+((float)a/b));
                    break;
                    
              case 5:
                    System.out.println("enter the number=");
                    a=sc.nextInt();
                    fact=1;
                    for(i=1;i<=a;i++)
                             fact=fact*i;
                    System.out.println("factorial of the number="+fact);
                    break;               
            }
        }while(choice!=6);
        sc.close();
    }
    
}
