import java.util.ArrayList;
import java.util.List;

public class Book implements Cloneable {
    private String title;
    private String author;
    protected List<String> chapters;  // Make it protected or provide a getter for chapters

    public Book(String title, List<String> chapters, String author) {
        this.title = title;
        this.chapters = chapters;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getChapters() {
        return chapters;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public Book clone() {
        try {
            Book clonedBook = (Book) super.clone();
            clonedBook.chapters = new ArrayList<>(this.chapters);  // Deep copy of chapters
            return clonedBook;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();  // Should never happen
        }
    }

    @Override
    public String toString() {
        return "Book{" + "title='" + title + "', author='" + author + "', chapters=" + chapters + '}';
    }
}
