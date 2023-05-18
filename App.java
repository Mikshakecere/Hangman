import java.util.*;
import java.lang.*;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // create list of random words
        String[] randWords = new String[] { "approach", "remark", "muggy", "stitch", "disorder",
                "sock", "cart", "flow", "articulate", "domination" };
        // choose a random word
        String answer = randWords[(int) Math.random() * 10];
        String hidden = hiddenWord(answer);
        System.out.println("Guess a character or a word but ill only count the first character");
        char input = in.next().charAt(0);
        // guessing portion
        while (hidden != answer) {
            hidden = reveal(answer, input);
            System.out.println(hidden);
            System.out.println("keep trying");
            input = in.next().charAt(0);
        }
        // fill in missing letters (method)
        System.out.println("OMAYGAWSH you got it wow grats");

        in.close();
    }

    public static String reveal(String word, char correct) {
        StringBuilder hidden = new StringBuilder("");
        for (int i = 0; i < word.length(); i++) {
            hidden.append(word.charAt(i) == correct ? correct : "_");
        }
        return hidden.toString();
    }

    public static String hiddenWord(String word) {
        StringBuilder hidden = new StringBuilder("");
        for (int i = 0; i < word.length(); i++) {
            hidden.append("_");
        }
        return hidden.toString();
    }
}