package com.vinci.vinciblog;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

//@WebAppConfiguration(value = "src/main/webapp")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-mybatis.xml",
        "classpath:spring/spring-mvc.xml",
        "classpath:mybatis/mybatis-config.xml"})
@WebAppConfiguration("src/main/resources")
public class BaseTest {
}


