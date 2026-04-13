package com.animeverse.controller;

import com.animeverse.service.AnimeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
public class AnimeController {

    private final AnimeService animeService;

    public AnimeController(AnimeService animeService) {
        this.animeService = animeService;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("animeList", List.of(
                "Naruto", "Attack on Titan", "One Piece", "Demon Slayer"
        ));
        return "index";
    }

    @GetMapping("/search")
    public String search(@RequestParam String q, Model model) {
        Map response = animeService.searchAnime(q);

        // Jikan returns results under "data"
        model.addAttribute("results", response.get("data"));
        model.addAttribute("query", q);

        return "search";
    }
}