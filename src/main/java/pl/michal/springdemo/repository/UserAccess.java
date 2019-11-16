package pl.michal.springdemo.repository;

import pl.michal.springdemo.domain.User;

import java.util.List;

public interface UserAccess {
    List<User> readAllUsers();
}
