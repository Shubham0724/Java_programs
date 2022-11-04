public class logical_operators {
    public static void main(String[] args) {
     System.out.println("For the Logical AND...");
        boolean a=true;
        boolean b=false;
        if (a && b){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }
        System.out.println("For logical OR.....");

        if (a||b){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }

        System.out.println("For Logical NOT");
        System.out.println("Not(a) is ");
        System.out.println(!a);
        System.out.println("NOT(b) is");
        System.out.println(!b);
    }
}
