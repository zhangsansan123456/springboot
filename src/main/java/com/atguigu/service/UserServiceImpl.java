package com.atguigu.service;

import com.atguigu.bean.User;
import com.atguigu.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    /**
     * 查询所有
     */
    @Override
    public List<User> findUsers() {
        return userDao.findAll();
    }
    /**
     * 根据id查询
     */
    @Override
    public User findUserById(Integer id) {
        return userDao.findById(id).get();
    }
    /**
     * 保存
     */
    @Override
    public void saveUser(User user) {
        userDao.save(user);
    }
    /**
     * 更新
     */
    @Override
    public void updateUser(User user) {
        userDao.save(user);
    }
    /**
     * 根据id删除
     */
    @Override
    public void deleteUserById(Integer id) {
        userDao.deleteById(id);
    }

}
