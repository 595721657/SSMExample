package cn.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.ssm.dao.UserDao;
import cn.ssm.pojo.User;
import cn.ssm.service.UserService;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public List<User> getList() {
        // TODO Auto-generated method stub
        return userDao.getUserList();
    }

}
