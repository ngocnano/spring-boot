package com.ngoctm.msscbeerservice.web.bootstrap;

import com.ngoctm.msscbeerservice.web.domain.Beer;
import com.ngoctm.msscbeerservice.web.model.BeerStyleEnum;
import com.ngoctm.msscbeerservice.web.repositories.BeerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class BeerLoader implements CommandLineRunner {

    private final BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadBeerObjects();
    }

    private void loadBeerObjects() {
        if(beerRepository.count() == 0){
            beerRepository.save(Beer.builder()
                    .beerName("Ha Noi")
                    .beerStyle(BeerStyleEnum.IPA)
                    .quantityToBrew(200)
                    .upc(337010000001L)
                    .minOnHand(12)
                    .price(new BigDecimal("12.95"))
                    .build());
        }
    }
}
