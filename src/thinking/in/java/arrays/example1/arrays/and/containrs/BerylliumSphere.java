package thinking.in.java.arrays.example1.arrays.and.containrs;

class BerylliumSphere {
    private static long counter;
    private final long id = counter++;

    @Override
    public String toString(){
        return "Sphere " + id;
    }
}
