package com.ngoctm.msscbrewery.web.controller;

import com.ngoctm.msscbrewery.web.model.BeerDto;
import com.ngoctm.msscbrewery.web.services.BeerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("api/v1/beer")
public class BeerController {

    @Autowired
    BeerServices beerServices;

    @RequestMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeer(@PathVariable UUID beerId){

        return new ResponseEntity<>(beerServices.getBeerById(beerId), HttpStatus.OK);
    }

    @PostMapping("/save")
    public  ResponseEntity<BeerDto> saveBeer(BeerDto beerDto){
        return new ResponseEntity<>(beerServices.saveBeer(beerDto), HttpStatus.CREATED);
    }
}
