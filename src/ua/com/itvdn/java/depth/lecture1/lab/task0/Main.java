package ua.com.itvdn.java.depth.lecture1.lab.task0;
//Необходимо разработать приложение, которое позволит сохранять информацию о логинах пользователей
//и их паролях. Каждому пользователю соответствует
//пара логин — пароль. При старте приложение отображается меню:
//1. Добавить нового пользователя;
//2. Удалить существующего пользователя;
//3. Проверить существует ли пользователь;
//4. Изменить логин существующего пользователя;
//5. Изменить пароль существующего пользователя;
//В зависимости от выбора пользователя выполняется действие, после чего меню отображается снова.
//Для решения задачи используйте подходящий класс из Java Collections Framework.
import java.util.ArrayList;
import java.util.List;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        List<User> users = new ArrayList<>();

        WorkWithUsers withUsers = new WorkWithUsers(users);

        for (int i = 0; i < 1; i++) {

            System.out.println("1. Add a new user;\n" +
                               "// 2. Delete an existing user;\n" +
                               "// 3. Check if the user exists;\n" +
                               "//4. Change the login of an existing user;\n" +
                               "//5. Change the password of an existing user;");

            try{

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String BuffRead = br.readLine();

                int input = Integer.parseInt(BuffRead);

                switch (input) {
                    case 1:
                        System.out.println("Enter login: ");
                        Scanner scan = new Scanner(System.in);
                        String login = scan.nextLine();

                        System.out.println("Enter password: ");
                        String password = scan.nextLine();

                        withUsers.addUsers(new User(login,password));
                        System.out.println();
                        break;


                }

            }catch (IOException e){
                System.out.println("Incorrect symbol!!!");
            }

        }
    }

}
