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
        User[] initCourse = {
                new Course(1l,"953101","Computer and Programming",3,701),
                new Course(2l,"953331","Compo Base Software",3,701),
                new Course(3l,"953321","SQA",3,701),
                new Course(4l,"953351","Test",3,701)


        };
        courseRepository.save(Arrays.asList(initCourse));

    }
} 