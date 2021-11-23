package ua.com.itvdn.java.depth.lecture2.lab;
import java.io.*;
//Задание 2
//Пользователь с клавиатуры вводит пути к трем
//файлам. Программа должна содержимое двух файлов
//записать в третий файл.
public class Path2 {
    public static void main(String[] args) {

        try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("lecture1.txt")));
            BufferedReader br2 = new BufferedReader(new InputStreamReader(new FileInputStream("ua.com.itvdn.java.depth.lecture2.txt")));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("lecture3.txt")))){
//            int s;
//            while ((s = br.read())!=-1){
//                System.out.println((char)s);
//            }
            String str, str2, str3;

            while ((str = br.readLine())!=null){
                bw.write(str+"\n");
            }

            while ((str2 = br2.readLine())!= null){
                bw.write(str2+"\n");
            }

        }catch (IOException e) {
            e.printStackTrace();
        }
    }

}
