package com.onke.spring.springboot;

public interface UserService {
    String addUser(long id, String name, String surname);
    void remove(long id);
    void getUser(long id);
}
