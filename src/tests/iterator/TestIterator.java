package tests.iterator;

import java.util.*;

public class TestIterator {
    public static void main(String[] args) {
        List<Integer> arl = new ArrayList<>();
        arl.add(2);
        arl.add(4);
        arl.add(6);
        System.out.println(arl);

        Iterator<Integer> iterator = arl.iterator();

        List<String> workers = new ArrayList<>();
        workers.add("Driver");
        workers.add("Engineer");
        workers.add("CTO");

        ListIterator<String> listIterator = workers.listIterator();
        while (listIterator.hasPrevious()){
            String worker = listIterator.previous();
            System.out.println(worker);
        }


        System.out.println();

        int[] numbers = {1, 2, 3, 4, 5};

        for (int temp : numbers) {
            System.out.print(temp + " ");
        }
    }
}
