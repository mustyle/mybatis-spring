package org.fool.ms.service.impl;

import org.fool.ms.dao.UserDAO;
import org.fool.ms.domain.User;
import org.fool.ms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserSeviceImpl implements UserService {
    @Autowired
    private UserDAO userDAO;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public User getUser(int id) {
        return this.userDAO.getUser(id);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public int insertUser(User user) {
        return this.userDAO.insertUser(user);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public int deleteUser(int id) {
        return this.userDAO.deleteUser(id);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public int updateUser(User user) {
        return this.userDAO.updateUser(user);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<User> findUsers() {
        return this.userDAO.findUsers();
    }
}
