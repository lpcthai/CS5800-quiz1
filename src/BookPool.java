import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookPool {
    private static final Map<String, Book> prototypes = new HashMap<>();

    static {
        prototypes.put("Java Programming", new Book("Java Programming", List.of("Introduction", "Chapter 1", "Chapter 2"), "Nima"));
        prototypes.put("Python Programming", new Book("Python Programming", List.of("Introduction", "Chapter 1", "Chapter 2"), "Nima"));
    }

    public static Book getPrototype(String title) {
        return prototypes.get(title).clone();  // Returns a clone of the book
    }
}
