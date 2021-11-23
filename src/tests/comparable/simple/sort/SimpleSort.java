package tests.comparable.simple.sort;
import java.util.Arrays;

public class SimpleSort {
    public static void main(String[] args) {

        int [] numbers = { 2,3,1,5,7,9 };
        String[] students = {"Alex", "Bob", "Andrew", "Yevhenii"};

        Arrays.sort(numbers);
        Arrays.sort(students);

        for(int temp : numbers){
            System.out.print(temp + " ");
        }

        System.out.println("\n--------------------------------------------------------------------------------------");

        for(String temp : students){
            System.out.print(temp + " ");
        }
    }
}
