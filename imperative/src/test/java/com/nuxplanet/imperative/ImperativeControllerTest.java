package com.nuxplanet.imperative;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest
public class ImperativeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void will_get_just_one_item() throws Exception {
        mockMvc.perform(get("/imperative/item"))
                .andExpect(status().isOk());

    }

    @Test
    public void will_get_lot_of_items() throws Exception {
        mockMvc.perform(get("/imperative/items"))
                .andExpect(status().isOk());

    }
}