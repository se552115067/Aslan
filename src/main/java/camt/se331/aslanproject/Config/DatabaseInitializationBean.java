package camt.se331.aslanproject.Config;


import camt.se331.aslanproject.Entity.User;
import camt.se331.aslanproject.repository.UserRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Profile("db.init")
@Component
public class DatabaseInitializationBean implements InitializingBean {
    @Autowired
    UserRepository userRepository;
    @Override
    public void afterPropertiesSet() throws Exception {
        User[] initUser = {


        };
        userRepository.save(Arrays.asList(initUser));

    }
} 