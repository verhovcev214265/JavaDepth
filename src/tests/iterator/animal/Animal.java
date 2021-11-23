package tests.iterator.animal;

public class Animal {

    private String name;
    private int age;

    Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name = '" + name + '\'' +
                ", age = " + age +
                '}';
    }
}
