package com.baomidou.springmvc.service.system;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;
import com.baomidou.springmvc.model.system.User;
import javafx.scene.control.Pagination;

import java.util.List;

/**
 *
 * User 表数据服务层接口
 *
 */
public interface IUserService extends IService<User> {

    Page<User> selectUserPage(String name);
}