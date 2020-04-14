package com.onke.spring.springboot;

import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {

    @Autowired
    FakeRepo fakeRepo;

    @Override
    public String addUser(long id, String name, String surname) {
        fakeRepo.insertUser(1, "Linus","Torvalds");
        return name;
    }

    @Override
    public void remove(long id) {
        fakeRepo.deleteUser(1);  // removes Linus
    }

    @Override
    public long getUser(long id) {
        fakeRepo.findById(1);
        return id;
    }
}
