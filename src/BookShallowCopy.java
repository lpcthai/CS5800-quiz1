import java.util.List;

public class BookShallowCopy implements Cloneable {
    private String title;
    private String author;
    private List<String> chapters;

    public BookShallowCopy(String title, List<String> chapters, String author) {
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

    public String getAuthor() {
        return author;
    }

    @Override
    public BookShallowCopy clone() {
        // Shallow copy: only the reference to chapters is copied, not the content
        return new BookShallowCopy(this.getTitle(), this.getChapters(), this.getAuthor());
    }

    @Override
    public String toString() {
        return "BookShallowCopy{" + "title='" + title + "', chapters=" + chapters + ", author='" + author + "'}";
    }
}
