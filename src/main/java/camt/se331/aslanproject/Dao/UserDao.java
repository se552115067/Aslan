package camt.se331.aslanproject.Dao;

import camt.se331.aslanproject.Entity.User;

import java.util.List;

/**
 * Created by Punjasin on 17/4/2558.
 */
public interface UserDao {
    List<User> getUsers();
    User getUser(Long id);
    User addUser(User user);
}
