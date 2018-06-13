package cn.golango;

import cn.golango.mybatis.App;
import cn.golango.mybatis.pojo.Contents;
import cn.golango.mybatis.service.ContentService;
import com.github.pagehelper.PageInfo;
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
public class ContentsTests {

    @Autowired
    ContentService contentService;

    @Test
    public void getLists() {

        List<Contents> contents = contentService.selectLists(2, 1);
        PageInfo page = new PageInfo(contents);

        System.out.println(page);
        System.out.println(contents);
    }
}
