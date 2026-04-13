package com.animeverse.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class AnimeService {

    private final RestTemplate restTemplate = new RestTemplate();

    public Map searchAnime(String query) {
        String url = "https://api.jikan.moe/v4/anime?q=" + query;
        return restTemplate.getForObject(url, Map.class);
    }
}