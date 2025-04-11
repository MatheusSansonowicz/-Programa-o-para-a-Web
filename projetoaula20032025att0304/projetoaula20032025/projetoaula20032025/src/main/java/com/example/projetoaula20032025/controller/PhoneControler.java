package com.example.projetoaula20032025.controller;

import com.example.projetoaula20032025.classesPadrao.Phone;
import com.example.projetoaula20032025.repository.PhoneRepository;
import com.example.projetoaula20032025.repository.UserRepository;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/phone")

public class PhoneControler {

    private final PhoneRepository phoneRepository;
    private final UserRepository userRepository;

    public PhoneControler(PhoneRepository phoneRepository, UserRepository userRepository) {
        this.phoneRepository = phoneRepository;
        this.userRepository = userRepository;
    }

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
