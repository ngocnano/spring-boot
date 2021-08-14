package com.ngoctm.msscbrewery.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data //getter, setter, equal, hash code
@NoArgsConstructor
@AllArgsConstructor
@Builder//builder pattern
public class BeerDto {
    private UUID id;
    private String beerName;
    private String beerStyle;
    private Long upc;
}
