package com.animeverse.api;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(AnimeApi.class)
class AnimeApiTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldReturnAnimeList() throws Exception {
        mockMvc.perform(get("/api/anime"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0]").value("Naruto"));
    }
}