package cn.golango;


import cn.golango.mybatis.App;
import cn.golango.mybatis.pojo.Users;
import cn.golango.mybatis.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = App.class)
@WebAppConfiguration
public class UserTests {

    @Autowired
    UserService userService;

    @Test
    public void testGetUser() {

        Users user = userService.selectByPrimaryKey(1);
        System.out.println(user);

    }

    @Test
    public void testGetUsers() {

        List<Users> users = userService.selectLists(1, 10);
        System.out.println(users);
    }
}
