package Lab1;

public class Book {
    private String name;
    private String author;
    private int year;
    public Book(String n, String a, int y){
        name = n;
        author = a;
        year = y;
    }
    public Book(String n){
        name = n;
        author = "No author";
        year = 0;
    }
    public Book(){
        name = "Book";
        author = "No author";
        year = 0;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setName(String name) { this.name = name; }
    public void setAuthor(String author) {this.author = author; }
    public String getName(String name){ return name; }
    public int getYear() { return year; }
    public String getAuthor(){ return author; }
    public String toString(){ return this.name+", author: " + this.author + ", year: "+this.year; }
}
