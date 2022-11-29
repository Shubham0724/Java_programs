import java.util.Scanner;

public class exp5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ch;
        do{
            System.out.println("\n1: to sort list of integers");
            System.out.println("2:to sort list of names");
            System.out.println("3:exit");
            System.out.println("enter choice= ");
            ch=sc.nextInt();
           switch(ch)
            {
          case 1: exp5 da= new exp5();
                        da.accept();
                        System.out.println("\ndisplay before sort");
                        da.display();
                        da.sort();
                        System.out.println("\nDisplay after sort");
                        da.display();
                        break;

          case 2: exp5 ds= new exp5();
                        ds.accept();
                        System.out.println("\ndisplay before sort");
                        ds.display();
                        ds.sort();
                        System.out.println("\nDisplay after sort");
                        ds.display();
                        break;
            }
        }while(ch!=3);
           sc.close();
    }
}
