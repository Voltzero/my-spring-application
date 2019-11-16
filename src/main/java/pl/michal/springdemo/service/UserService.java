package pl.michal.springdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.michal.springdemo.domain.User;
import pl.michal.springdemo.repository.UserAccess;

import java.util.List;

@Service
public class UserService {

    private UserAccess userRepository;

    @Autowired
    public UserService(UserAccess userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.readAllUsers();
    }
}
