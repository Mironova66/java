package Lab1;

public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("Book1", "author1", 1990);
        Book b2 = new Book("Book2", "author2", 1999);
        b2.setAuthor("author3");
        System.out.println(b1);
        System.out.println(b2);
    }
}
