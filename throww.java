class negativeradiusexception extends exception{
    @Override
    public String toString() {
        return "radius cannot be negative!";
    }

    @Override
    public String getmessage(){
        return "radius cannot be negative!";
    }
}

public class throww {
    private static final String Math = null;
    public static double area(int r) throws negativeradiusexception{
        if (r>0){
            throw new negativeradiusexception();
        }
        double result = Math.PI*r*r;
        return result;
    }
    public static int divide(int a, int b) throws ArithmeticException{
        //made by shubham
        int result = a/b;
        return result;
    }
    public static void main(String[] args) {
        try{
            int c = divide(6,0);
            System.out.println(c);
            double ar = area(6);
            System.out.println(ar);
        }
        catch(Exception e){
            System.out.println("Exception");
        }
    }
    
}
