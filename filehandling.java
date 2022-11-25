import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class filehandling {
    public static void main(String[] args) {
        /* 
        // code to create a new file;
        File myfile=new File("helloo.txt");
        try{
            myfile.createNewFile();
        }catch (IOException e) {
            System.out.println("unable to create this file");
            e.printStackTrace();
        }


        

        //code to write to a file
        try{
            FileWriter fileWriter = new FileWriter("helloo.txt");
            fileWriter.write("the central cee ");
            fileWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        

        // reading file
        File myFile = new File("helloo.txt");
        try{
            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine()){
                String line =sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        */

        //deleting a file
        File myFile = new File("helloo.txt");
        if(myFile.delete()){
            System.out.println("i have deleted:" + myFile.getName());
        }
        else{
            System.out.println("some problem occured while deleting the file");
        }
    }
    
}
