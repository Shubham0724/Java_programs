class library{
    String[] books;
    int no_of_books;
    library(){
        this.books = new String[100];
        this.no_of_books = 0;
    }

    void addbook(String book){
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book+ "has been added!");
    }

    void showavaliblebooks(){
        System.out.println("avalible books are:");
        for (String book : this.books){
            if (book == null){
                continue;
            }
            System.out.println("*" +book);
        }
    }

    void issuebook(String book){
        for (int i=0;i<this.books.length;i++){
            if(this.books[i].equals(book)){
                System.out.println("the book has been issued!");
                this.books[i]=null;
                return;
            }
        }
        System.out.println("this book does not exist");
    }
    void returnbook(String book){
        addbook(book);
    }

}
public class library_solution {
    public static void main(String[] args) {
        // you have to implement a library using java class "library"
        //methods : addbook, issued, returnbook, showavaliblitybooks
        //properities: array to store the avalible book,
        //array to store the issued book


        library centrallibrary = new library();
        centrallibrary.addbook("think and grow rich");
        centrallibrary.addbook("algorithms");
        centrallibrary.addbook("c++");
        centrallibrary.showavaliblebooks();


        centrallibrary.issuebook("c++");
        centrallibrary.showavaliblebooks();
        centrallibrary.returnbook("c++");
        centrallibrary.showavaliblebooks();
    }
    
}
