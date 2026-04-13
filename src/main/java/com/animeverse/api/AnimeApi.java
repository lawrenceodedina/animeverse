package com.animeverse.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AnimeApi {

    @GetMapping("/api/anime")
    public List<String> getAnime() {
        return List.of("Naruto", "Jujutsu Kaisen", "Bleach", "Tokyo Ghoul");
    }
}
