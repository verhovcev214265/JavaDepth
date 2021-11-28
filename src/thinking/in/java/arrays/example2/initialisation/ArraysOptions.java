package thinking.in.java.arrays.example2.initialisation;
import java.util.*;

public class ArraysOptions {
    public static void main(String[] args) {

        BerylliumSphere[] a; // local no initialisation variable
        BerylliumSphere[] b = new BerylliumSphere[5];

        // default initialisation values licks in the arrays is (null)
        System.out.println("b = " + Arrays.toString(b));
        System.out.println("==========================================================================================");

        BerylliumSphere[] c = new BerylliumSphere[4];
        for (int i = 0; i < c.length; i++) {
            if (c[i] == null){
               c[i] = new BerylliumSphere();
            }
        }

        // Dynamic aggregate initialisation (the final comma is optional)
        a = new BerylliumSphere[] { new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere(),};

        // Aggregate initialisation  (the final comma is optional)
        BerylliumSphere[] d = {new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere(),};

        System.out.println("a length = " + a.length);
        System.out.println("b length = " + b.length);
        System.out.println("c length = " + c.length);
        System.out.println("d length = " + d.length);
        a = d;
        System.out.println("a length = " + a.length);

        // arrays for primitive type
        int[] e;
        int[] f = new int[5];
        System.out.println("f = " + Arrays.toString(f));

        int[] g = new int[4];
        for (int i = 0; i < g.length; i++) {
            g[i] = i * i;
        }

        int[] h = {11, 47, 93};
        System.out.println("f length = " + f.length);
        System.out.println("g length = " + g.length);
        System.out.println("h length = " + h.length);
        e = h;
        System.out.println("e length = " + e.length);

        e = new int[] {1, 2};
        System.out.println("e length = " + e.length);

    }
}
