package pl.michal.springdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.michal.springdemo.domain.User;
import pl.michal.springdemo.repository.UserRepository;

import java.util.Collections;
import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUser(){
        return Collections.emptyList();
    }
}
