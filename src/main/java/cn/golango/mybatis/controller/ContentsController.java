package cn.golango.mybatis.controller;

import cn.golango.mybatis.dto.ContentDto;
import cn.golango.mybatis.pojo.Contents;
import cn.golango.mybatis.service.ContentService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/content")
public class ContentsController {

    @Autowired
    ContentService contentService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index(@RequestParam(value = "page", defaultValue = "1") int page,
                        Model model) {

        List<Contents> contents = contentService.selectLists(page, 2);
        PageInfo<Contents> pageinfo = new PageInfo<>(contents);

        model.addAttribute("contents", contents);
        model.addAttribute("pageinfo", pageinfo);

        System.out.println(pageinfo);

        return "content/index";
    }

    @RequestMapping(value = "/detail", method = RequestMethod.GET)
    public String detail(Model model) {

        ContentDto dto = new ContentDto();
        dto.setCid(1);
        dto.setName("名称");

        model.addAttribute("contents", dto);
        return "content/detail";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String detail(ContentDto dto) {

        System.out.println(dto.getCid());
        System.out.println(dto.getName());
        System.out.println(dto.getCid3());

        return "redirect:/content/detail";
    }


}
