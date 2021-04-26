package com.vinci.vinciblog.mapper;

import com.vinci.vinciblog.bean.Link;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;


/**
 * @Oescription:
 * @Author: Vinci_Ma
 * @Date Created in 2021-04-02-10:15
 * @Modified By:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration("src/main/resources")
@ContextConfiguration({"classpath*:spring/spring-mybatis.xml",
        "classpath*:spring/spring-mvc.xml",
        "classpath*:mybatis/mybatis-config.xml"})
public class LinkMapperTest extends TestCase {

    @Autowired
    private LinkMapper linkMapper;

    @Test
    public void testGetLinkById() {
        Link link = linkMapper.getLinkById(1);
        System.out.println(link.toString());
    }
}