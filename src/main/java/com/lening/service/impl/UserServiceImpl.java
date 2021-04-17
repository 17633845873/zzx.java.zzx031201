package com.lening.service.impl;

import com.lening.entity.UserBean;
import com.lening.mapper.UserMapper;
import com.lening.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 创作时间：2021/3/10 10:59
 * 作者：李增强
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public List<UserBean> getUserList() {
        return userMapper.selectAll();
    }
}
