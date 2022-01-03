package exercises;
import java.util.Scanner;

public class Alice {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String text = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        String searchText = text.toLowerCase();
        String searchTerm;
        String foundTerm;

        System.out.println("Please enter a term to search: ");
        searchTerm = input.nextLine();
        input.close();

        if(searchText.contains(searchTerm.toLowerCase())){
            foundTerm = "DOES";
        } else {
            foundTerm = "does NOT";
        }

        System.out.println("The text " + foundTerm + " contain " + searchTerm);
    }
}
