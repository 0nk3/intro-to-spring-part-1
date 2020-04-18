package com.onke.spring.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest(classes = SpringbootApplication.class)
class UserServiceImplTest {

    ApplicationContext ctx = new AnnotationConfigApplicationContext(UserServiceImpl.class);
    UserServiceImpl userService = ctx.getBean("userServiceImpl", UserServiceImpl.class);

    @Test
    void addUser() {
        assertEquals("Linus",userService.addUser(1,"Linus", "Torvalds"));
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
        assertEquals(user.getId(), userService.getUser(1));  // same user id ==> same user
    }
}