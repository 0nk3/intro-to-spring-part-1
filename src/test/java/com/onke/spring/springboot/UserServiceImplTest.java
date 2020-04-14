package com.onke.spring.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest(classes = SpringbootApplication.class)
class UserServiceImplTest {

    UserService se =  new UserServiceImpl();

    @Test
    void addUser() {
        assertEquals("Linus",se.addUser(1,"Linus", "Torvalds"));
    }

    @Test
    void remove() {
        //no return type
    }

    @Test
    void getUser() {
        User user =  new User();
        user.setName("Linus");
        user.setSurname("Torvalds");
        user.setId(1);
        assertEquals(user, se.getUser(1));
    }
}