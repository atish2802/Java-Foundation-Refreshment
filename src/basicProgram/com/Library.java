class MyLibrary{
    String books[] =new String[100];
    int noOfBooks = 0;

     void addBook(String book){
        books[noOfBooks]=book;
        noOfBooks++;
        System.out.println(book+" is added");
            // System.out.println("*"+book);
    } 
    void issueBook(String book){
        for(int i = 0;i < books.length;i++){
            if(books[i]==book){
                System.out.println(book+"The book has been issued ");
                books[i] =null;
                return;
            }
        }
        System.out.println("The book does not exist.");
    }
    void returnBook(String book){
        books[noOfBooks]=book;
        noOfBooks++;
        System.out.println(book+" is returned");
    }
    void availableBook(){
        System.out.println("The Available books are -->");
        for(int i = 0;i<books.length;i++){
            if(books[i]==null){
                continue;
            } 
            System.out.println("*"+books[i]);
        }
    }
}
public class Library{
    public static void main(String [] args){
     MyLibrary l = new MyLibrary();
     l.addBook("Java");
     l.addBook("Python");
     l.addBook("C");
     l.addBook("JavaScript");
     l.addBook("PHP");
     l.addBook("Go");
     l.availableBook();
     l.issueBook("Java");
     l.availableBook();
     l.returnBook("Java");
     l.availableBook();
    }
}