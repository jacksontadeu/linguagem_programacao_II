package edu.fatec.lp2.demo_springboot.service;

import edu.fatec.lp2.demo_springboot.entity.User;
import edu.fatec.lp2.demo_springboot.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> listarTodos() {
        return userRepository.findAll();
    }
    public void salvar(User user) {
        userRepository.save(user);
    }
}
