package org.example.springdocjsonview;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@AutoConfigureMockMvc
@SpringBootTest
class SpringdocJsonviewApplicationTests {

    @Autowired
    MockMvc mockMvc;

    @Test
    void shouldHandleJsonView() throws Exception {
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/v3/api-docs"))
                .andReturn();

        String content = result.getResponse().getContentAsString();

        Assertions.assertThat(content).doesNotContain("parentField");
    }

}
