package com.project.IntegraClub.Service;

import com.project.IntegraClub.Repository.UserRepository;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {this.userRepository = userRepository;}

    public User salvar(User user) {
        return userRepository.save(user);
    }

    public void excluir(User user){
        userRepository.delete(user);
    }

    public User buscarPorId(Integer id){
        return userRepository.findById(id).orElse(null);
    }

    public List<User> buscarTodos() {
        return (List<User>) userRepository.findAll();
    }
}
