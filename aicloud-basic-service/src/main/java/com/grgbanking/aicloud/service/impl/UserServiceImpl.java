package com.grgbanking.aicloud.service.impl;

import com.grgbanking.aicloud.entity.UserEntity;
import com.grgbanking.aicloud.mapper.UserMapper;
import com.grgbanking.aicloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    public List<UserEntity> getAll() {
        List<UserEntity> users=userMapper.getAll();
        return users;
    }

    public UserEntity getOne(Long id) {
        UserEntity user=userMapper.getOne(id);
        return user;
    }

    public void insert(UserEntity user) {
        userMapper.insert(user);
    }

    public void update(UserEntity user) {
        userMapper.update(user);
    }

    public void delete(Long id) {
        userMapper.delete(id);
    }
}
