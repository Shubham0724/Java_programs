import java.util.Scanner;

class myexception extends exception{
    @Override
    public String toString(){
        return "i am toString()";
    }

    @Override
    public String getmessage(){
        return "i am getmessage()";
    }
   
}

class maxageexception extends exception{
    @Override
    public String toString(){
        return "age cannot be greater than 125";
    }

    @Override
    public String getmessage() {
        return "make sure that the values of age entered id correct";
    }
}

public class exception_class {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        if(a<9){
            try{
                throw new ArithmeticException("this is an exception");
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
                System.out.println("finished");
            }
            System.out.println("yes finised");
        }
    }
    
}
