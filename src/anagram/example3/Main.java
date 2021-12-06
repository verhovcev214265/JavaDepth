package anagram.example3;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean exit = false;

        while (!exit) {
            System.out.println("Enter some text: \n" + "If you want to go out enter (wq)");
            Scanner scan = new Scanner(System.in);
            String input = scan.nextLine().toLowerCase();

            if (input.equals("wq")) {
                System.out.println("Bye bye");
                exit = true;
            } else {
                System.out.println("You input: " + input);
                Anagram anagram = new Anagram();
                String output = anagram.reverse(input);
                System.out.println("After revers: " + output);
            }
        }
    }

}
