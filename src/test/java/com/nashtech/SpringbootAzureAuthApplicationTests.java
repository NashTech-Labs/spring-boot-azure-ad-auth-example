package com.nashtech;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;


@WebMvcTest(SpringbootAzureAuthApplication.class)
class SpringbootAzureAuthApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testWelcomeWhenGetRequestThenReturnMessage() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/login"))
                .andExpect(MockMvcResultMatchers.status().isUnauthorized());
    }
}
