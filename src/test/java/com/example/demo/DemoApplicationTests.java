package com.example.demo;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.util.AssertionErrors.assertTrue;

@SpringBootTest
class DemoApplicationTests {

    private Logic logic;

    @BeforeEach
    void init() {
        logic = new Logic();
    }

    @Test
    void contextLoads() {
    }

    @Test
    void testSum() {
        assertEquals(2, logic.sum(1, 1));
    }

    @Test
    void testProduct(){
        assertEquals(9, logic.product(3,3));
    }

}
