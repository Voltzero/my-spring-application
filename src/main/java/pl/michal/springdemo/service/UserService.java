package pl.michal.springdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.michal.springdemo.domain.User;
import pl.michal.springdemo.repository.UserAccess;

import java.util.Collections;
import java.util.List;

@Service
public class UserService {

    private UserAccess userAccess;

    @Autowired
    public UserService(UserAccess userAccess) {
        this.userAccess = userAccess;
    }


    public List<User> getAllUser() {
        return Collections.emptyList();
    }
}
