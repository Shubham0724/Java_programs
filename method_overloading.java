public class method_overloading {
    static void foo(){
        System.out.println("good morning bro!");
    }

    static void foo(int a){
        System.out.println("good morning " + a + "bro!");
    }

    static void foo(int a, int b){
        System.out.println("good morning " +a+ "bro!");
        System.out.println("good morning" +b+ "bro!");
    }
    static void foo(int a, int b, int c){
        System.out.println("good morning " +a+ "bro!");
        System.out.println("good morning" +b+ "bro!");
    }
    static void change(int a){
        a=98;
    }

    static void change2(int  [] arr){
        arr[0] = 98;
    }
    static void tellJoke(){
        System.out.println("I invented a new world!\n" + "plagiarism!");
    }

    public static void main(String[] args) {
        tellJoke();

        int x=45;
        change(x);
        System.out.println("the value of x after running change is:" + x);

        int [] marks = {52,77,45,89,43,90};
        change2(marks);
        System.out.println("the value of x after running change is: " +marks[0]);


        //method overloading
        foo();
        foo(3000);
        foo(3000,4000);
        
    }

        
}
