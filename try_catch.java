public class try_catch{
    public static void main(String[] args) {
        int a=6000;
        int b=0;
        //without try;
        //int c = a/b;
        //System.out.println("the result is  "+c);
        try{
            int c=a/b;
            System.out.println("the results is  "+c);
        }
        catch(Exception e){
            System.out.println("we filled to divide. reason: ");
            System.out.println(e);
        }
        System.out.println("end of program");
    }
}