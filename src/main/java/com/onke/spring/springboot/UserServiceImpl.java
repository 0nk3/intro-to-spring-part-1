package com.onke.spring.springboot;

import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements FakeRepoInterface {

    @Autowired
    FakeRepo fakeRepo;

    @Override
    public void insertUser(long id, String name, String surname) {

    }

    @Override
    public User findById(long id) {
        return null;
    }

    @Override
    public void deleteUser(long id) {

    }
    public void addUser(String name, String surname){
        //TODO
    }
    public void removeUser(long Id){
        //TODO
    }
    public void getUser(long Id){
        //
    }
}
