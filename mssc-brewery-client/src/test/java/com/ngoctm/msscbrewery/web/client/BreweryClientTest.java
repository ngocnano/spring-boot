package com.ngoctm.msscbrewery.web.client;

import com.ngoctm.msscbrewery.web.model.BeerDto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.net.URI;
import java.util.UUID;

@SpringBootTest
public class BreweryClientTest {

    @Autowired
    BreweryClient breweryClient;

    @Test
    void getBeerById(){
        BeerDto beerDto = breweryClient.getBeerById(UUID.randomUUID());
        Assertions.assertNotNull(beerDto);
    }

    @Test
    void testSaveNewBeer(){
        BeerDto beerDto = BeerDto.builder().beerName("Halida").build();
        BeerDto newBeer = breweryClient.saveNewBeer(beerDto);
        Assertions.assertNotNull(newBeer);
        System.out.println(newBeer.toString());
    }

    @Test
    void testUpdateBeer(){
        BeerDto beerDto = BeerDto.builder().beerName("Halida").build();
        breweryClient.updateBeer(UUID.randomUUID(), beerDto);
    }

    @Test
    void testDeleteBeer(){
        breweryClient.deleteBeer(UUID.randomUUID());
    }

}
