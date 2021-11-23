package ua.com.itvdn.java.depth.lecture8.lab;

public class MyClass1 implements Runnable{

    int[] arr;
    private int minimum;

    public int getMinimum() {
        return minimum;
    }

    MyClass1(){}

    MyClass1(int[] arr){
        this.arr = arr;
    }

    @Override
    public void run() {

    }
}
