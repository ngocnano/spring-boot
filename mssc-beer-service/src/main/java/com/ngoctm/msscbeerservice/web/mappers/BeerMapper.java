package com.ngoctm.msscbeerservice.web.mappers;

import com.ngoctm.msscbeerservice.web.domain.Beer;
import com.ngoctm.msscbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {
    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto beerDto);
}
