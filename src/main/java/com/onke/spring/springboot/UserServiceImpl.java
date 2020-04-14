package com.onke.spring.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class UserServiceImpl implements UserService {
    private static final Logger LOGGER = LogManager.getLogger(UserService.class.getName());
    @Autowired
    FakeRepoInterface fakeRepo;

    @Override
    public String addUser(long id, String name, String surname) {
        fakeRepo.insertUser(1, "Linus","Torvalds");
        LOGGER.info(name + " Entered");
        return name;
    }

    @Override
    public void remove(long id) {
            LOGGER.info(getUser(id) + " removed");
        fakeRepo.deleteUser(1);  // removes Linus
    }

    @Override
    public long getUser(long id) {
        LOGGER.info("hello " + fakeRepo.findById(id).getName());
        fakeRepo.findById(1);
        return id;
    }
}
