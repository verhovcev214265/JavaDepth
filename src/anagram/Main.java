package anagram;
import java.util.Scanner;
public class Main {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        try {
                System.out.println("Enter some text: " +
                        "\nIf you want to go out enter wq");

                String inputText = scan.nextLine().toLowerCase();

                if (inputText.equals("wq")) {
                    System.out.println("Bye - Bye");
                } else {
                    char[] letters = inputText.toCharArray();
                    System.out.println("Your text: " + inputText);

                    Revers reverse = new Revers();
                    reverse.anagram(letters);

                    String textAfterAnagram = new String(letters);
                    System.out.println("anagram: " + textAfterAnagram);
                }
        } catch (Exception e) {
            System.out.println("Incorrect symbol!!!!!");
        }
    }
}
