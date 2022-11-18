import java.util.Scanner;

public class error {
    public static void main(String[] args) {
        //syntax error demo
        //int a=5 //error => no semicolon!
        //b=6; //error => b is not declared
        //System.out.println(a+b);

        //logical error demo
        //write a program to print all prime numbers between 1 to 10
        //System.out.println(2);
        //for (int i=1;i<10;i++){
        //    System.out.println(2*i+1);
        //}

        //runtime error 
        int k;
        Scanner sc = new Scanner(System.in);
        k=sc.nextInt();
        System.out.println("integrate part of 1000 divided by k is"+ 1000/k);
    }
    
}
