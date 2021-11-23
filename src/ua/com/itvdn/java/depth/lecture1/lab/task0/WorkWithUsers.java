package ua.com.itvdn.java.depth.lecture1.lab.task0;

import java.util.ArrayList;
import java.util.List;

public class WorkWithUsers {

    List<User> users;

    public WorkWithUsers(List<User> users) {
        this.users = users;
    }

    void addUsers(User user){
        users.add(user);
    }

    void remoteUser(User user){
        users.remove(user);
    }

    boolean containsUser(User user){
       return users.contains(user);
    }

    void changeLogin (String Log, User login){
        int ind = users.indexOf(login);

        users.set(ind, new User(Log, login.getPassword()));
    }

    void changePassword(int indexPass, User user){

    }
}
