package springcourse._1.Project2boot.dao;


import springcourse._1.Project2boot.model.User;

import java.util.List;

public interface UserDao {

    List<User> getListUsers();

    void addUser(User user);

    User getUser(Long id);

    void updateUser(User user);

    void deleteUser(Long id);
}