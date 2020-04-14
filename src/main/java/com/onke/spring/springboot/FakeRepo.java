package com.onke.spring.springboot;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class FakeRepo implements FakeRepoInterface {

    ArrayList<User> users = new ArrayList<>();

    @Override
    public void insertUser(long id, String name, String surname) {
        users.add(new User(id, name, surname));
        System.out.println("name \t" + name);
    }

    @Override
    public User findById(long id) {
        for (User user : users) {
            if(user.getId() == id){
                System.out.println("User Found : " + user.getName());
                return user;
            }
        }
        return null;
    }

    @Override
    public void deleteUser(long id) {
        users.removeIf(user -> user.getId() == id);
    }

    @Override
    public String toString() {
        return "FakeRepo{" +
                "users=" + users +
                '}';
    }
}
