package thinking.in.java.arrays.example1.arrays.and.containrs;
import thinking.in.java.arrays.example1.arrays.and.containrs.BerylliumSphere;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ContainerComparison {
    public static void main(String[] args) {

        BerylliumSphere[] spheres = new BerylliumSphere[10];
        for (int i = 0; i < 5; i++) {
            spheres[i] = new BerylliumSphere();
            System.out.println(Arrays.toString(spheres));
        }
        System.out.println(spheres[4]);
        System.out.println("=========================================================================================");

        List<BerylliumSphere> sphereList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            sphereList.add(new BerylliumSphere());
            System.out.println(sphereList);
        }
        System.out.println(sphereList.get(4));
        System.out.println("=========================================================================================");

        int[] integers = {0, 1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(integers));
        System.out.println(integers[4]);
        System.out.println("=========================================================================================");

        List<Integer> intList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            intList.add(i);
        }
        intList.add(97);
        System.out.println(intList);
        System.out.println(intList.get(4));
        System.out.println("=========================================================================================");
    }
}
