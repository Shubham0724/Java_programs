import javax.lang.model.util.Elements;

public class for_each_loop {
    public static void main(String[] args) {
       /*
        float [] marks = {98.5f, 45.67f, 40.00f, 34.98f,90.07f};
        String[] students ={"central","lil","cole","pop","divine"};
        System.out.println(students.length);
        System.out.println(students[0]);
        */

        int [] marks = {98,45,78,90,43};
        //System.out.println(marks.length);
         
        //Displaying the array (native way)
        System.out.println("printing using native way");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        //displaying the array (for loop)
        System.out.println("printing using for loop");
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }

        //displaying the array in reverse order 
        System.out.println("printing the array using for loop in reverse order");
        for(int i=marks.length -1;i>=0;i--){
            System.out.println(marks[i]);
        }
        
        // displaying the array (for-each loop)
        System.out.println("printing using for each-loop ");
        for(int element: marks){
            System.out.println(element);
        }


    }
    
}
