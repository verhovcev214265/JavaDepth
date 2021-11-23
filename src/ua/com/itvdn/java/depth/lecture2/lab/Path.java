package ua.com.itvdn.java.depth.lecture2.lab;

//Задание 1
//Пользователь с клавиатуры вводит путь к файлу. После
//чего содержимое файла отображается на экране.

import java.io.*;

public class Path {
    public static void main(String[] args) {
         String path = "lecture2";

        try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("lecture1.txt")))){

//            int s;
//            while ((s = br.read())!=-1){
//                System.out.println((char)s);
//            }

            String str;
            while ((str = br.readLine())!=null){
                System.out.println(str);
            }

        }catch (IOException e) {
            e.printStackTrace();
        }
    }


}
