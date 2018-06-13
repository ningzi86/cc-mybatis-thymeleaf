package cn.golango.mybatis.service;


import cn.golango.mybatis.pojo.Users;

import java.util.List;


public interface UserService {

    Users selectByPrimaryKey(Integer id);

    List<Users> selectLists(Integer pageIndex, Integer pageSize);
}
