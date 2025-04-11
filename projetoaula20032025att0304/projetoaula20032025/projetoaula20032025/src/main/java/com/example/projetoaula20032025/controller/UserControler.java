package com.example.projetoaula20032025.controller;

import com.example.projetoaula20032025.classesPadrao.User;
import com.example.projetoaula20032025.repository.UserRepository;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")

public class UserControler {
    private final UserRepository userRepository;

    public UserControler(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/novo")
    public String formNewUser(Model model) {
        model.addAttribute("user", new User());
        return "FormUser";
    }
}
