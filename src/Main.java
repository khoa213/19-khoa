import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Book book1 = new Book("doraemon","Fujio F Fujiko",45);
        Book book2 = new Book("one piece","Oda Eiichirou",70);
        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        Library lib = new Library();
        lib.setBooks(books);
        lib.returnBook("doraemon");
        lib.returnBook("doraemon");
        lib.returnBook("one piece");
        lib.returnBook("one piece");
        System.out.println(lib.getBooks());
//          Account acc1 = new Account(1,1000000);
//          Transaction trans1 = new Transaction();
//          trans1.deposit(acc1,500000);
//          System.out.println(acc1);
//          trans1.withdraw(acc1,1500000);
//          System.out.println(acc1);
    }
}