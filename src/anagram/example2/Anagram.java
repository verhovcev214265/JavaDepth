package anagram.example2;
public class Anagram {

    public String revers(String input) {

        char[] letters = input.toCharArray();

        int start = 0;
        int finish = letters.length - 1;

        while (start < finish) {
            if (!Character.isAlphabetic(letters[start])) {
                start++;
            } else if (!Character.isAlphabetic(letters[finish])) {
                finish--;
            } else {
                char temp = letters[start];
                letters[start] = letters[finish];
                letters[finish] = temp;
                start++;
                finish--;
            }
        }
        return new String(letters);
    }

    public String separateWords(String input) {

        String[] words = input.split(" ");

        for (int i = 0; i < words.length; i++) {
            revers(words[i]);
        }
        return String.join(" ", words);
    }

}

