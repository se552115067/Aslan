package camt.se331.aslanproject.Dao;

import camt.se331.aslanproject.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Punjasin on 17/4/2558.
 */

public interface UserDao {
    List<User> getUsers();
    User getUser(Long id);
    User addUser(User user);
}
