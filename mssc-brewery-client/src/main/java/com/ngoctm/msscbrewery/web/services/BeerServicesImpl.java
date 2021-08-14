package com.ngoctm.msscbrewery.web.services;

import com.ngoctm.msscbrewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServicesImpl implements BeerServices {
    @Override
    public BeerDto getBeerById(UUID beerID) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle("Pale Ale")
                .build();
    }

    @Override
    public BeerDto saveBeer(BeerDto beerDto) {
        beerDto.setId(UUID.fromString("6f4da5e5-f48b-4e74-b02b-dd0736b4654c"));
        return beerDto;
    }
}
