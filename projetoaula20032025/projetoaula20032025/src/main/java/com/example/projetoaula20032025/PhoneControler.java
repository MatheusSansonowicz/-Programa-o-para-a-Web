package com.example.projetoaula20032025;

import com.example.projetoaula20032025.repository.PhoneRepository;
import com.example.projetoaula20032025.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/phone")
@RequiredArgsConstructor
public class PhoneControler {

    private final PhoneRepository phoneRepository;
    private final UserRepository userRepository;

    @GetMapping("/novo")
    public String formNovo(Model model) {
        model.addAttribute("phone", new Phone());
        model.addAttribute("users", userRepository.findAll());
        return "FormPhone";
    }

    @PostMapping
    public String salvar(@ModelAttribute Phone phone) {
        System.out.println(phone);
        phoneRepository.save(phone);
        return "redirect:/phones";
    }

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("phones", phoneRepository.findAll());
        return "ListaPhones";
    }
}
