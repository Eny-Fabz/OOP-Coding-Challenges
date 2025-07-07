import java.util.Scanner;
public class BookInformation {
    Scanner scanner = new Scanner(System.in);

    public void readBookAndAuthor() {
        String title;
        String authorName;

        System.out.print("Book Title? ");
        title = scanner.nextLine();

        System.out.print("Author's Name? ");
        authorName = scanner.nextLine();

        System.out.println("This book" + title + "was wriitten by " + authorName + ".");
    }

    public static void main(String[] args) {
        (new BookInformation()).readBookAndAuthor();
    }
}
