package com.ngoctm.msscbrewery.web.services;

import com.ngoctm.msscbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerServices {

    BeerDto getBeerById(UUID beerID);

    BeerDto saveBeer(BeerDto beerDto);
}
