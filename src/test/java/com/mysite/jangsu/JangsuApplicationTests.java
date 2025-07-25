package com.mysite.jangsu;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mysite.jangsu.question.QuestionService;


@SpringBootTest
class JangsuApplicationTests {

    @Autowired
    private QuestionService questionService;

	@Test
    void testJpa() {
    }
}

