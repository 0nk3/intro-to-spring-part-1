package com.onke.spring.springboot;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private static final Logger LOGGER = LogManager.getLogger(UserService.class.getName());
    // dependency injection
    FakeRepoInterface fakeRepo;
    @Autowired
    public UserServiceImpl(FakeRepoInterface fakeRepo) {
        this.fakeRepo = fakeRepo;
    }

    @Override
    public String addUser(long id, String name, String surname) {
        userService.addUser(1, "Linus","Torvalds");
        LOGGER.info(name + " Entered");
        return name;
    }

    @Override
    public void remove(long id) {
        userService.remove(1);
        LOGGER.info(getUser(id) + " removed");

    }

    @Override
    public long getUser(long id) {
        LOGGER.info("hello " + fakeRepo.findById(id).getName());
        userService.getUser(1);
        return id;
    }
}
