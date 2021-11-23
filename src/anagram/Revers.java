package anagram;

public class Revers {

    public void anagram(char[] userText){
        int start = 0;
        int finish = userText.length - 1;

        while (start < finish){
            if (!Character.isAlphabetic(userText[start])){
                start++;
            }else if(!Character.isAlphabetic(userText[finish])){
                finish--;
            }else {
                char temp = userText[start];
                userText[start] = userText[finish];
                userText[finish] = temp;
                start++;
                finish--;
            }
        }
    }
}
