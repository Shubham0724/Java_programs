// Creating a rock paper scissors game
/*
 1. import random,Scanner class(ran for random and sc for scanner)
 2. take input from user 
 3. print the results of computing in R,P,s forms 
 4. Declare the winner or looser
 */


 import java.util.Random;
 import java.util.Scanner;

public class rock_paper_scissors_game {
    public static void main(String[] args) {
        Random ran = new Random();
        Scanner sc = new Scanner(System.in);

        int a=4;
        int b=4;
        String userin = "";
        String sysin="";
        System.out.println("Enter your choice \n1.Rock \n2.Paper \n3.Scissor\n\n");
        while(sc.hasNextInt()){
            a=sc.nextInt();
            userin=RPS(a);

            b=1+ran.nextInt(3);
            sysin=RPS(b);

            if(sysin !=""&&userin !=""){
                System.out.println("Your input:"+userin);
                System.out.println("System output:"+sysin);

                if((userin=="Rock" && sysin =="Paper")|| (userin == "Paper" && sysin=="Scissor") || (userin=="Scissor" && sysin=="Rock"))
                {
                    System.out.println("You lost this Round \nPlease, Try Again \n");
                }
                else if(sysin==userin)
                {
                    System.out.println("This match is draw\nPlease, Try again \n");
                }
                else
                {
                    System.out.println("You WON\n");
                }

        
            }
        }
    sc.close();

    }

    public static String RPS(int b) {
        String value="";
        switch(b){
            case 1:value= "Rock";
                break;
            case 2:value= "Paper";
                break;  
            case 3:value= "Scissor";
                break;
            default:System.out.println("Please, print a vaild choice");    
                         
        }
        return(value);
    }
    
}
