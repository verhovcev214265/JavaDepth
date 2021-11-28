package thinking.in.java.arrays.example2.initialisation;

class BerylliumSphere {
    private static long counter;
    private final long id = counter++;

    @Override
    public String toString(){
        return "Sphere " + id;
    }
}
