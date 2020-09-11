package Lab1;

public class Book {
    String tag = "Harry Potter";
    int page;
    public Book (int tmp){
        page = tmp;
    }

    public String toString() {
        return "Book's " + "tag is " + tag + ", page=" + page;
    }
}
