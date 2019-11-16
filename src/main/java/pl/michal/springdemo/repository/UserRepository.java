package pl.michal.springdemo.repository;

import org.springframework.stereotype.Repository;
import pl.michal.springdemo.domain.User;

import java.util.Collections;
import java.util.List;

@Repository
public class UserRepository {

    public List<User> readAllUsersFromDB() {

        return Collections.emptyList();
    }
}
