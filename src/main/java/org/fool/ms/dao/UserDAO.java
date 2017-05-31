package org.fool.ms.dao;

import org.fool.ms.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDAO {
    User getUser(int id);

    int deleteUser(int id);

    int insertUser(User user);

    int updateUser(User user);

    List<User> findUsers();
}
