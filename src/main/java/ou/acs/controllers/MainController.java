package ou.acs.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ou.acs.entity.User;

@RestController("/")
public class MainController {
    @GetMapping
    public User getUser() {
        return new User(1L, "username", "password");
    }
}
