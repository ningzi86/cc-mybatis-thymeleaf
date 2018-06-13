package cn.golango.mybatis.service.impl;

import cn.golango.mybatis.dao.ContentsMapper;
import cn.golango.mybatis.pojo.Contents;
import cn.golango.mybatis.pojo.ContentsExample;
import cn.golango.mybatis.service.ContentService;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("contentService")
public class ContentServiceImpl implements ContentService {

    @Resource
    ContentsMapper contentsMapper;

    @Override
    public List<Contents> selectLists(Integer pageIndex, Integer pageSize) {

        PageHelper.startPage(pageIndex, pageSize);

        ContentsExample example = new ContentsExample();
        return contentsMapper.selectByExample(example);

    }

}
