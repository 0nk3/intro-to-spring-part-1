package com.onke.spring.springboot;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class FakeRepo implements FakeRepoInterface {

    ArrayList<User> users = new ArrayList<>();

    @Override
    public void insertUser(long id, String name, String surname) {
        users.add(new User(id, name, surname));
    }

    @Override
    public User findById(long id) {
        return null;
    }

    @Override
    public void deleteUser(long id) {

    }

    @Override
    public String toString() {
        return "FakeRepo{" +
                "users=" + users +
                '}';
    }
}
