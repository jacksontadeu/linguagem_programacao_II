 package edu.fatec.lp2.demo_springboot.controller;

import edu.fatec.lp2.demo_springboot.entity.User;
import edu.fatec.lp2.demo_springboot.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;

 @RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<Iterable<User>> listarTodos() {

        return ResponseEntity.ok().build();
    }
    @PostMapping
    public ResponseEntity<User> salvar(@RequestBody User user) {
        userService.salvar(user);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
