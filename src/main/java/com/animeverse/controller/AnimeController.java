package com.animeverse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class AnimeController {

    @GetMapping("/")
    public String home(Model model) {
        List<String> animeList = List.of("Naruto", "Attack on Titan", "One Piece", "Demon Slayer");
        model.addAttribute("animeList", animeList);
        return "index";
    }
}