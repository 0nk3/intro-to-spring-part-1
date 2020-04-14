package com.onke.spring.springboot;

public interface UserService {
    void addUser(String name, String surname);
    void remove(long Id);
    void getUser(long Id);
}
