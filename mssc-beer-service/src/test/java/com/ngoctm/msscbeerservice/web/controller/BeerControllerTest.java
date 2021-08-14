package com.ngoctm.msscbeerservice.web.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ngoctm.msscbeerservice.web.model.BeerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.junit.jupiter.api.Test;

import java.util.UUID;

@WebMvcTest(BeerController.class)
public class BeerControllerTest {
    @Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;

    @Test
    void getBeerById() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/beer/" + UUID.randomUUID().toString())
                .accept(MediaType.APPLICATION_JSON)).andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    void saveNewBeer() throws Exception {
        BeerDto beerDto = BeerDto.builder().build();
        String beerToJSON = objectMapper.writeValueAsString(beerDto);
        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/beer/")
                .contentType(MediaType.APPLICATION_JSON)
                .content(beerToJSON))
                .andExpect(MockMvcResultMatchers.status().isCreated());
    }

    @Test
    void updateById() throws Exception {
        BeerDto beerDto = BeerDto.builder().build();
        String beerToJSON = objectMapper.writeValueAsString(beerDto);
        mockMvc.perform(MockMvcRequestBuilders.put("/api/v1/beer/" + UUID.randomUUID().toString())
                .contentType(MediaType.APPLICATION_JSON)
                .content(beerToJSON))
                .andExpect(MockMvcResultMatchers.status().isNoContent());
    }


}