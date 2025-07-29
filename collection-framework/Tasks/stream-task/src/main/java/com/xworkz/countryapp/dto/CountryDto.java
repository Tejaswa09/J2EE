package com.xworkz.countryapp.dto;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CountryDto {
    private String name;
    private  int pinCode;
    private long populationInMillions;
    private int noOfStates;
    private int massInSqKms;
    private String primeMinister;
    private String primaryLang;
    private String secondaryLang;
    private double gdp;
    private String countryCode;
    private String countryCurrency;
}
