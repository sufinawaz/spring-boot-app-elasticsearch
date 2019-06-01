package io.sufi.springbootappelasticsearch.rest;

import io.sufi.springbootappelasticsearch.model.User;
import io.sufi.springbootappelasticsearch.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class UserResource {
    private UserService userService;

    @Autowired
    public UserResource(final UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/user")
    @ResponseBody
    User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @RequestMapping("/user/username/{username}")
    @ResponseBody
    List<User> getUserByUsername(@PathParam("username") final String username) {
        return userService.getUserByUsername(username);
    }
}
