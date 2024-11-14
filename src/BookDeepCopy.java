import java.util.ArrayList;
import java.util.List;

public class BookDeepCopy extends Book {

    public BookDeepCopy(String title, List<String> chapters, String author) {
        super(title, chapters, author);
    }

    @Override
    public BookDeepCopy clone() {
        List<String> clonedChapters = new ArrayList<>(this.getChapters());  // Deep copy of chapters
        return new BookDeepCopy(this.getTitle(), clonedChapters, this.getAuthor());
    }

    @Override
    public String toString() {
        return "BookDeepCopy{" + "title='" + getTitle() + "', chapters=" + getChapters() + ", author='" + getAuthor() + "'}";
    }
}
