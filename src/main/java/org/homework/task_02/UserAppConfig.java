package org.homework.task_02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class UserAppConfig {

    @Bean
    @Scope("prototype")
    public UserRepository getRepository()
    {
       return new UserRepository();
    };

    @Bean
    @Scope("prototype")
    public UserService userService(UserRepository repository){
        return new UserService(repository);
    }
}
