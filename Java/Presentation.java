import java.util.*;

// Abstraction
abstract class Library{
    private String name;
    private int id;
    public Library(String name,int id){
        this.name = name;
        this.id = id;
    }
    public String getName(){ 
        return name; 
    }
    public int getId(){
         return id; 
    }
    public abstract void displayInfo();
}

class Book extends Library{
    private String author;
    public Book(String name,int id,String author){
        super(name, id);
        this.author = author;
    }
    public void displayInfo(){
        System.out.println("Book: " + getName() + ", Author: " + author);
    }
}

class Magazine extends Library{
    private int issueNumber;
    public Magazine(String name,int id,int issueNumber) {
        super(name, id);
        this.issueNumber = issueNumber;
    }
    public void displayInfo() {
        System.out.println("Magazine: " + getName() + ", Issue #: " + issueNumber);
    }
}

public class Presentation{
    public static void main(String[] args) {
        // List to store library items (ArrayList)
        List<Library> items = new ArrayList<>();
        items.add(new Book("The Hobbit", 101, "J.R.R. Tolkien"));
        items.add(new Magazine("National Geographic", 102, 75));

        // Set to store unique members (HashSet)
        Set<String> members = new HashSet<>();
        members.add("Alice");
        members.add("Bob");

        // Map to associate members with borrowed items (HashMap)
        Map<String, List<Library>> borrowedItems = new HashMap<>();

        // Simulate borrowing
        borrowedItems.put("Alice", new ArrayList<>());
        borrowedItems.get("Alice").add(items.get(0)); // Alice borrows The Hobbit

        borrowedItems.put("Bob", new ArrayList<>());
        borrowedItems.get("Bob").add(items.get(1)); // Bob borrows Magazine

        // Display Library Items
        System.out.println("Library Inventory:");
        for (Library item : items) {
            item.displayInfo();
        }

        System.out.println("\nLibrary Members:");
        for (String member : members) {
            System.out.println("- " + member);
        }

        // Display Borrowed Items
        System.out.println("\nBorrowed Items:");
        for (String member : borrowedItems.keySet()) {
            System.out.println(member + " borrowed:");
            for (Library item : borrowedItems.get(member)) {
                item.displayInfo();
            }
        }
    }
}