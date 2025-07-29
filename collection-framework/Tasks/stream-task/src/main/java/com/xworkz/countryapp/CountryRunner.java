package com.xworkz.countryapp;

import com.xworkz.countryapp.dto.CountryDto;

import java.net.Socket;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CountryRunner {
    public static void main(String[] args) {

        List<CountryDto> dtos = new ArrayList<CountryDto>();
        dtos.add(new CountryDto("India",91,1444L,29,327823823,"Narendra Modi","Hindi","English",1.4,"IND","rupees"));
        dtos.add(new CountryDto("United States",1,339L,50,9833520,"Joe Biden","English","Spanish",28.0,"USA","US Dollar"));
        dtos.add(new CountryDto("China",86,1425L,34,9596961,"Li Qiang","Mandarin","Cantonese",18.5,"CHN","Yuan"));
        dtos.add(new CountryDto("United Kingdom",44,67L,4,243610,"Keir Starmer","English","Welsh",3.5,"GBR","Pound Sterling"));
        dtos.add(new CountryDto("Germany",49,83L,16,357588,"Olaf Scholz","German","English",4.7,"DEU","Euro"));
        dtos.add(new CountryDto("Australia",61,27L,6,7692024,"Anthony Albanese","English","Indigenous Languages",1.7,"AUS","Australian Dollar"));
        dtos.add(new CountryDto("Argentina",54,46L,23,2780400,"Javier Milei","Spanish","Italian",0.63,"ARG","Argentine Peso"));
        dtos.add(new CountryDto("Austria",43,9L,9,83879,"Karl Nehammer","German","English",0.54,"AUT","Euro"));

// Countries starting with 'R'
        dtos.add(new CountryDto("Russia",7,144L,85,17098246,"Mikhail Mishustin","Russian","None",2.2,"RUS","Russian Ruble"));
        dtos.add(new CountryDto("Romania",40,19L,41,238397,"Marcel Ciolacu","Romanian","Hungarian",0.36,"ROU","Romanian Leu"));
        dtos.add(new CountryDto("Rwanda",250,14L,5,26338,"Edouard Ngirente","Kinyarwanda","French",0.013,"RWA","Rwandan Franc"));

//        for (CountryDto dto :dtos){
//            System.out.println(dto);
//        }

        System.out.println("ALL countries");
        dtos.stream().forEach(System.out::println);
        System.out.println();

        System.out.println("Country starting letter A");
        dtos.stream().filter(country-> country.getName().toLowerCase().startsWith("a")).forEach(System.out::println);
        System.out.println();

        System.out.println("Country Starting with R");
        dtos.stream().filter(country -> country.getName().toLowerCase().startsWith("r")).forEach(System.out::println);
        System.out.println();

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Find by pincode");
//        int pinCode;
//
//        System.out.println("Enter the pincode that should be searched");
//        pinCode=scanner.nextInt();
//        dtos.stream().filter(country->country.getPinCode() == pinCode).forEach(System.out::println);
//        System.out.println();

//        System.out.println("Find country by Prime Minister");
//        String primeMinister;
//        System.out.print("Enter the prime Minister for you are looking for : ");
//        primeMinister = scanner.nextLine();
//        dtos.stream().filter(country -> country.getPrimeMinister().toLowerCase().equals(primeMinister.toLowerCase())).forEach(System.out::println);

        System.out.println("Countrie mass in Square km between  90000 and 18000000");
        dtos.stream().filter(country -> country.getMassInSqKms()>=900000  && country.getMassInSqKms()<=18000000).forEach(System.out::println);
        System.out.println();

        System.out.println("Countries with primary lang as English");
        dtos.stream().filter(country -> country.getPrimaryLang().toLowerCase().equals("english")).forEach(System.out::println);
        System.out.println();

        System.out.println("Countries have no of State more than 29");
        dtos.stream().filter(country -> country.getNoOfStates() >=29).forEach(System.out::println);
        System.out.println();

        System.out.println("Country having max population");
        System.out.println(dtos.stream().max(Comparator.comparingLong(country -> country.getPopulationInMillions())));// or we can use CountryDto::getPopulationInMillions
        System.out.println();

        System.out.println("Country have the min population");
        System.out.println(dtos.stream().min(Comparator.comparing(CountryDto::getPopulationInMillions)));
        System.out.println();

        System.out.println("find the country ranging between 50 and 100 million population");\
        

        scanner.close();



    }
}
