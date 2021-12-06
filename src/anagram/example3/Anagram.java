package anagram.example3;
public class Anagram {

    private final String space = " ";

    private int start;
    private int finish;

    public String reversWords(String input) {
        char[] letters = input.toCharArray();
        start = 0;
        finish = letters.length - 1;

        while (start < finish) {
            if (!Character.isAlphabetic(letters[start])) {
                start++;
            } else if (!Character.isAlphabetic(letters[finish])) {
                finish--;
            } else {
                reverseNoAlphabet(letters);
                start++;
                finish--;
            }
        }
        return new String(letters);
    }

    public void reverseNoAlphabet (char[] letters) {
        char temp = letters[start];
        letters[start] = letters[finish];
        letters[finish] = temp;
    }

    public String reverse(String input) {

        String[] inputWords = input.split(space);
        String[] outputSentences = new String[inputWords.length];

        for (int i = 0; i < inputWords.length; i++) {
           outputSentences[i] = reversWords(inputWords[i]);
           start = 0;
        }

        return String.join(space, outputSentences);
    }
}
