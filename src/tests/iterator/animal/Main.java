package tests.iterator.animal;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        Animal cat = new Animal("Naphanya", 3);
        Animal dog = new Animal("Chelsea",5);

        List<Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);

        ListIterator<Animal> listIterator = animals.listIterator();

        while (listIterator.hasNext()){
            Animal temp = listIterator.next();
            System.out.println(temp);
        }


    }
}
