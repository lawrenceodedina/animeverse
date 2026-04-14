package com.animeverse.api;

import com.animeverse.service.AnimeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(AnimeApi.class)
class AnimeApiTest {

    @Autowired
    private MockMvc mockMvc;

    // 🔥 THIS IS THE FIX
    @MockBean
    private AnimeService animeService;

    @Test
    void searchEndpointWorks() throws Exception {
        mockMvc.perform(get("/api/anime/search?q=naruto"))
                .andExpect(status().isOk());
    }
}