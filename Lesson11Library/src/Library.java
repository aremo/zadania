
public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter", "J.K.Rowling", 2008, "12434390");
        BookDao dao = new BookDao();
        dao.save(book1);
        dao.close();
    }
}
