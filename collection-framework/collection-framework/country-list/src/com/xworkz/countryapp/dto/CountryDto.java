package com.xworkz.countryapp.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString

public class CountryDto {


   private String countryName;
   private String capital;
   private String area;
   private Long population;
   private String density;
   private String currency;
   private String callingCode;
   private String countryCode;
   private String internetTLD;


}
