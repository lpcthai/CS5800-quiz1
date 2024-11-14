import java.util.ArrayList;
import java.util.List;

public class Driver {

    public static void main(String[] args) {
        // Create list of chapters
        List<String> chapters = new ArrayList<>();
        chapters.add("\n Chapter 1");
        chapters.add(" Chapter 2");
        chapters.add(" Chapter 3");

        // Creating a BookDeepCopy object
        BookDeepCopy originalDeepBook = new BookDeepCopy("Introduction to Software", chapters, "Nima");
        BookDeepCopy clonedDeepBook = originalDeepBook.clone();

        // Display original and cloned deep copy books
        System.out.println("\nOriginal Deep Copy Book: " + originalDeepBook);
        System.out.println("\nCloned Deep Copy Book: " + clonedDeepBook);


        originalDeepBook.getChapters().set(0, "Introduction");

        // After modification
        System.out.println("\nAfter Modification:");
        System.out.println("Original Deep Copy Book: " + originalDeepBook);
        System.out.println("Cloned Deep Copy Book: " + clonedDeepBook);

        // Creating a BookShallowCopy object (not a Book object)
        BookShallowCopy originalShallowBook = new BookShallowCopy("Introduction of software", chapters, "Nima");
        BookShallowCopy clonedShallowBook = originalShallowBook.clone();  // Clone it correctly as BookShallowCopy


        System.out.println("\nOriginal Shallow Copy Book: " + originalShallowBook);
        System.out.println("\nCloned Shallow Copy Book: " + clonedShallowBook);


        originalShallowBook.getChapters().set(0, "Introduction");

        System.out.println("\nAfter Modification:");
        System.out.println("Original Shallow Copy Book: " + originalShallowBook);
        System.out.println("Cloned Shallow Copy Book: " + clonedShallowBook);
    }
}
