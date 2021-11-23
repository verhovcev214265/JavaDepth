package tests.bublesort;
import java.util.Scanner;
import java.util.Arrays;

public class SortArray {

    public static int[] arrayFill() {
        System.out.println("Input length of array: ");

        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();

        int[] array = new int[length];

        for (int i = 0; i < array.length; i++) {

            System.out.println("Write " + i + " index");
            array[i] = scan.nextInt();
        }
        return array;
    }

   public static void bubbleSort(int[] array){
       for (int i = 0; i < array.length; i++) {
           for (int j = 0; j < array.length - 1; j++) {

               if (array[j + 1] > array[j]){
                   int temp = array[j + 1];
                   array[j + 1] = array[j];
                   array[j] = temp;
               }
           }
       }
   }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("The " + i + " index = " + array[i] + ".");
        }
    }

    public static void main(String[] args) {

        int[] myArray = arrayFill();

        bubbleSort(myArray);
        //Arrays.sort(myArray);

        printArray(myArray);
    }
}
