import java.util.ArrayList;
import java.util.List;

 class Library {
    private List<Book> books ;

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
    public void borrow (String title) {
        int quantity=0;
        for (int i=0;i<books.size();i++) {
            if (books.get(i).getTitle()==title) {
                quantity = books.get(i).getQuantity()-1  ;
                books.get(i).setQuantity(quantity);
            }
        }
    }
    public void returnBook (String title) {
        int quantity=0;
        for (int i=0;i<books.size();i++) {
            if (books.get(i).getTitle()==title) {
                quantity = books.get(i).getQuantity()+1  ;
                books.get(i).setQuantity(quantity);
            }
        }
    }
}
