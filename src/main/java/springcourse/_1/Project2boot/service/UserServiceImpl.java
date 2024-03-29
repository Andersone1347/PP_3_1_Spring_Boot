package springcourse._1.Project2boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import springcourse._1.Project2boot.dao.UserDao;
import springcourse._1.Project2boot.model.User;


import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private final UserDao us;

    @Autowired
    public UserServiceImpl(UserDao userDAO) {
        this.us = userDAO;
    }


    @Override
    public List<User> getListUsers() {
        return us.getListUsers();
    }


    @Override
    public void addUser(User user) {
        us.addUser(user);
    }

    @Override
    public User getUser(Long id) {
        return us.getUser(id);
    }



    @Override
    public void updateUser(User user) {
        us.updateUser(user);
    }


    @Override
    public void deleteUser(Long id) {
        us.deleteUser(id);
    }


}