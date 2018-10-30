
public class Book {
    private String author;
    private String title;

    public Book(String author, String title) {
        this.title = title;
        this.author = author;

    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Author : " + author + "\n" + "Title: " + title;
    }

    @Override
    public boolean equals(Object obj) {
        Book otherBook = (Book) obj;

        return title.equals(otherBook.getTitle()) && author.equals(otherBook.getAuthor());

    }

    @Override
    public int hashCode() {

        int result = author.hashCode();
        result = 31 * result + title.hashCode();

        return result;
    }
}
