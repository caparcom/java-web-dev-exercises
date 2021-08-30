package exercises;
import java.util.Locale;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String firstSentence = ("Alice was beginning to get very tired of sitting by " +
                "her sister on the bank, and of having nothing to do: once or twice she had " +
                "peeped into the book her sister was reading, but it had no pictures or conversations" +
                " in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'");
        System.out.println("Enter a word I can search for in Alice In Wonderland, " +
                "and I will let if you know if it's there: ");
        String word = input.nextLine();
        String upper = word.substring(0, 1).toUpperCase() + word.substring(1);
        String lower = word.toLowerCase();
        input.close();
        if (firstSentence.contains(upper) || firstSentence.contains(lower)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }


    }
}
