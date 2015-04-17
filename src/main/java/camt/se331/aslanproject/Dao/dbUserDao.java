package camt.se331.aslanproject.Dao;

import camt.se331.aslanproject.Entity.User;
import camt.se331.aslanproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Punjasin on 17/4/2558.
 */
@Profile("db.dbdao")
@Repository

public class dbUserDao implements UserDao {
    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(Long id) {
        return userRepository.findOne(id);
    }

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }
}
