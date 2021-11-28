package thinking.in.java.arrays.ex3.returns;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class IceCream {
    private static Random rang = new Random(47);

    static final String[] FLAVORS = {
            "Chocolate", "Strawberry", "Vanilla Fudge Swirl",
            "Mint Chip", "Mocha Almond Fudge", "Rum Raisin",
            "Praline Cream", "Mud pie"
    };

    public static String[] flavorSet(int n) {
        if (n > FLAVORS.length)
            throw new IllegalArgumentException("Set to big");

        String[] results = new String[n];

        boolean[] picked = new boolean[FLAVORS.length];
        for (int i = 0; i < n; i++) {
            int temp;
            do
                temp = rang.nextInt(FLAVORS.length);

            while (picked[temp]);
            results[i] = FLAVORS[temp];
            picked[temp] = true;
        }
        return results;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            System.out.println(Arrays.toString(flavorSet(3)));
        }
    }
}
