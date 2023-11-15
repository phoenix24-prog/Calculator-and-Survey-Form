//. Check if Input is Pangram
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PangramCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String input = scanner.nextLine();

        boolean isPangram = checkPangram(input.toLowerCase());
        if (isPangram) {
            System.out.println("The input is a Pangram.");
        } else {
            System.out.println("The input is not a Pangram.");
        }
    }

    private static boolean checkPangram(String sentence) {
        Set<Character> alphabetSet = new HashSet<>();
        for (char c = 'a'; c <= 'z'; c++) {
            alphabetSet.add(c);
        }

        for (char c : sentence.toCharArray()) {
            if (Character.isLetter(c)) {
                alphabetSet.remove(c);
            }
        }

        return alphabetSet.isEmpty();
    }
}
