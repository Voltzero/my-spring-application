package pl.michal.springdemo.repository;

import org.springframework.stereotype.Repository;
import pl.michal.springdemo.domain.User;

import java.util.Arrays;
import java.util.List;

@Repository
public class UserRepository implements UserAccess {


    @Override
    public List<User> readAllUsers() {
        return Arrays.asList(
                new User("admin", "admin"),
                new User("admin321", "admin123"),
                new User("majkel", "jordan")
        );
    }
}
