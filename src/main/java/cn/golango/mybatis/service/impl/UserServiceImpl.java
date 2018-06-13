package cn.golango.mybatis.service.impl;

import cn.golango.mybatis.dao.UsersMapper;
import cn.golango.mybatis.pojo.Users;
import cn.golango.mybatis.pojo.UsersExample;
import cn.golango.mybatis.service.UserService;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    UsersMapper usersMapper;

    @Override
    public Users selectByPrimaryKey(Integer id) {
        return usersMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Users> selectLists(Integer pageIndex, Integer pageSize) {

        PageHelper.startPage(pageIndex, pageSize);

        UsersExample example = new UsersExample();
        return usersMapper.selectByExample(example);

    }

}
