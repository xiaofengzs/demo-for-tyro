package com.zxf.demofortyro;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@SpringBootTest
@AutoConfigureMockMvc
class HelloControllerTest {

    @Autowired
    public MockMvc mockMvc;

    @Test
    public void should_return_bye_when_input_name() throws Exception {
        mockMvc.perform(get("/api/greeting/bye/Tristan"))
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(content().string("see you agian, Tristan"));
    }
}
