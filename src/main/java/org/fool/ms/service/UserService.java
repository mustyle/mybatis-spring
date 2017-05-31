package org.fool.ms.service;

import org.fool.ms.domain.User;

import java.util.List;

public interface UserService {
    User getUser(int id);

    int insertUser(User user);

    int deleteUser(int id);

    int updateUser(User user);

    List<User> findUsers();
}
