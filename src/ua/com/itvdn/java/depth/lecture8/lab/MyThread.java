package ua.com.itvdn.java.depth.lecture8.lab;

//Пользователь с клавиатуры вводит значения в массив. После чего запускаются две потока.
//Первый поток находит максимум в массиве. Второй поток находит минимум в массиве.
//Результаты вычислений возвращаются в метод main.

public class MyThread {
    public static void main(String[] args) {

        int[] numbers = new int[1000];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) ((Math.random() * 50) - 30);
            System.out.println(numbers[i]);
        }
    }
}
