package com.baomidou.springmvc.service.system.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import javafx.scene.control.Pagination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.baomidou.springmvc.mapper.system.UserMapper;
import com.baomidou.springmvc.model.system.User;
import com.baomidou.springmvc.service.system.IUserService;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 *
 * User 表数据服务层接口实现类
 *
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Page<User> selectUserPage(String name) {
        User user = new User();
        if (!StringUtils.isEmpty(name)){
            user.setName(name);
        }
        Page<User> page = new Page<User>(1,2);
        EntityWrapper<User> eWrapper = new EntityWrapper<>(user);
        Page<User> roleDOList = selectPage(page, eWrapper);
        return roleDOList;
    }
}