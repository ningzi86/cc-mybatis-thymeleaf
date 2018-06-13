package cn.golango.mybatis.service;

import cn.golango.mybatis.pojo.Contents;

import java.util.List;

public interface ContentService {
    
    List<Contents> selectLists(Integer pageIndex, Integer pageSize);

}
