package com.example.projetoaula20032025;

import com.example.projetoaula20032025.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserControler {
    private final UserRepository userRepository;

    @GetMapping("/novo")
    public String formNewUser(Model model) {
        model.addAttribute("user", new User());
        return "FormUser";
    }

    public 
}
