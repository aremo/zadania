package pl.javastart.springbootexample;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    private List<User> users = new ArrayList<>();

    public UserRepository() {
        users.add(new User("Adrian", "Abacki", 16));
        users.add(new User("Kornel", "Babacki", 19));
        users.add(new User("Fabian", "Cebularz", 28));
    }

    public List<User> getAllUsers() {
        return users;
    }

    @Override
    public String toString() {
        return users.toString();
    }
}
