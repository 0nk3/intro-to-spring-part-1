package com.onke.spring.springboot;

public interface FakeRepoInterface {
    void insertUser (long id, String name, String surname);
    User findById(long id);
    void deleteUser(long id);
}
