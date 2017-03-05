package pl.javastart.springbootexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.javastart.springbootexample.User;
import pl.javastart.springbootexample.UserRepository;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("")
    @ResponseBody
    public String allUsers() {


        List<User> allUsers = userRepository.getAllUsers();
        for (User allUser : allUsers) {

        }

        return allUsers.toString();
    }
}
