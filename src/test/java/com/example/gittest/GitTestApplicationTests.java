package com.example.gittest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GitTestApplicationTests {

    @Test
    void contextLoads() {
        System.out.println("hello master");
        System.out.println("hello hot-fix");
        System.out.println("pull test!");
    }

}
