package com.animeverse.api;

import com.animeverse.service.AnimeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/anime") // 🔥 REQUIRED
public class AnimeApi {

    private final AnimeService animeService;

    public AnimeApi(AnimeService animeService) {
        this.animeService = animeService;
    }

    @GetMapping("/search") // 🔥 REQUIRED
    public Object searchAnime(@RequestParam String q) {
        return animeService.searchAnime(q);
    }
}