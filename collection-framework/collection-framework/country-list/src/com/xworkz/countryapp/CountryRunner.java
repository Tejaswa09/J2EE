package com.xworkz.countryapp;

import com.xworkz.countryapp.dto.CountryDto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class CountryRunner {
    public static void main(String[] args) {
        CountryDto india = new CountryDto("India",
                "Delhi",
                "3,287,260 km.sq ,1,269,218 km.sq",
                1_393_409_038L,
                "424 / km.sq ,1,098 / mi.sq",
                "Indian Rupee",
                "+91",
                "IN, IND",
                ".in"
        );
        CountryDto nepal = new CountryDto(
                "Nepal",
                "Kathmandu",
                "147,516 km²",
                29_609_623L,
                "201 / km²",
                "Nepalese Rupee",
                "+977",
                "NP, NPL",
                ".np"
        );

        CountryDto zimbabwe = new CountryDto(
                "Zimbabwe",
                "Harare",
                "390,757 km²",
                14_961_028L,
                "38 / km²",
                "Zimbabwean Dollar",
                "+263",
                "ZW, ZWE",
                ".zw"
        );

        CountryDto yemen = new CountryDto(
                "Yemen",
                "Sana'a",
                "527,968 km²",
                30_250_000L,
                "57 / km²",
                "Yemeni rial",
                "+967",
                "YE, YEM",
                ".ye"
        );

        CountryDto moldova = new CountryDto(
                "Moldova",
                "Chișinău",
                "33,846 km²",
                2_657_637L,
                "79 / km²",
                "Moldovan leu",
                "+373",
                "MD, MDA",
                ".md"
        );

        CountryDto angola = new CountryDto(
                "Angola",
                "Luanda",
                "1,246,700 km²",
                35_000_000L,
                "",
                "Angolan kwanza",
                "+244",
                "",
                ".ao"
        );

        CountryDto lebanon = new CountryDto(
                "Lebanon",
                "Beirut",
                "10,400 km²",
                6_100_000L,
                "",
                "Lebanese pound",
                "+961",
                "",
                ".lb"
        );

        CountryDto burkinaFaso = new CountryDto(
                "Burkina Faso",
                "Ouagadougou",
                "272,967 km²",
                21_312_078L,
                "78 / km²",
                "West African CFA franc",
                "+226",
                "BF, BFA",
                ".bf"
        );

        CountryDto guinea = new CountryDto(
                "Guinea",
                "Conakry",
                "245,857 km²",
                13_200_000L,
                "",
                "Guinean franc",
                "+224",
                "GN, GIN",
                ".gn"
        );

        CountryDto djibouti = new CountryDto(
                "Djibouti",
                "Djibouti",
                "23,200 km²",
                883_560L,
                "38 / km²",
                "Djiboutian franc",
                "+253",
                "DJ, DJI",
                ".dj"
        );

        CountryDto senegal = new CountryDto(
                "Senegal",
                "Dakar",
                "196,722 km²",
                16_425_864L,
                "83 / km²",
                "West African CFA franc",
                "+221",
                "SN, SEN",
                ".sn"
        );

        CountryDto switzerland = new CountryDto(
                "Switzerland",
                "Zurich",
                "41,285 km²",
                8_847_000L,
                "214 / km²",
                "Swiss Franc",
                "+41",
                "CH, CHE",
                ".ch"
        );

        CountryDto colombia = new CountryDto(
                "Colombia",
                "Bogotá",
                "1,138,914 km²",
                52_200_000L,
                "",
                "Colombian Peso",
                "+57",
                "CO, COL",
                ".co"
        );

        CountryDto turkey = new CountryDto(
                "Turkey",
                "Ankara",
                "783,562 km²",
                85_400_000L,
                "",
                "Turkish lira",
                "+90",
                "TR, TUR",
                ".tr"
        );

        CountryDto burkinaFas = new CountryDto(
                "Burkina Faso",
                "Ouagadougou",
                "272,967 km²",
                21_312_078L,
                "78 / km²",
                "West African CFA franc",
                "+226",
                "BF, BFA",
                ".bf"
        );

        CountryDto japan = new CountryDto(
                "Japan",
                "Tokyo",
                "380,000km²",
                126_300_000L,
                "",
                "Japanese Yen",
                "+81",
                "JP, JPN",
                ".jp"
        );
        CountryDto bangladesh = new CountryDto(
                "Bangladesh",
                "Dhaka",
                "147,570km²",
                173_000_000L,
                "1,173 / km²",
                "Bangladeshi Taka",
                "+880",
                "BD, BGD",
                ".bd"
        );

        CountryDto pakistan = new CountryDto(
                "Pakistan",
                "Islamabad",
                "881,913km²",
                251_000_000L,
                "285 / km²",
                "Pakistani Rupee",
                "+92",
                "PK, PAK",
                ".pk"
        );
        CountryDto nigeria = new CountryDto(
                "Nigeria",
                "Abuja",
                "923,768km²",
                216_700_000L,
                "234 / km²",
                "Nigerian Naira",
                "+234",
                "NG, NGA",
                ".ng"
        );
        CountryDto germany = new CountryDto(
                "Germany",
                "Berlin",
                "357,386km²",
                83_240_000L,
                "233 / km²",
                "Euro",
                "+49",
                "DE, DEU",
                ".de"
        );
        CountryDto brazil = new CountryDto(
                "Brazil",
                "Brasília",
                "8,515,76km²",
                218_689_757L,
                "23.8 / km²",
                "Brazilian Real",
                "+55",
                "BR, BRA",
                ".br"
        );
        CountryDto argentina = new CountryDto(
                "Argentina",
                "Buenos Aires",
                "2,780,400km²",
                46_600_000L,
                "16 / km²",
                "Argentine Peso",
                "+54",
                "AR, ARG",
                ".ar"
        );
        CountryDto australia = new CountryDto(
                "Australia",
                "Canberra",
                "7,686,850km²",
                21_515_754L,
                "2.8 / km²",
                "Australian Dollar",
                "+61",
                "AU, AUS",
                ".au"
        );
        CountryDto canada = new CountryDto(
                "Canada",
                "Ottawa",
                "9,984,670km²",
                39_600_000L,
                "4.0 / km²",
                "Canadian Dollar",
                "+1",
                "CA, CAN",
                ".ca"
        );
        CountryDto southKorea = new CountryDto(
                "South Korea",
                "Seoul",
                "100,363km²",
                52_081_799L,
                "507 / km²",
                "South Korean Won",
                "+82",
                "KR, KOR",
                ".kr"
        );
        CountryDto spain = new CountryDto(
                "Spain",
                "Madrid",
                "505,990km²",
                47_450_000L,
                "94 / km²",
                "Euro",
                "+34",
                "ES, ESP",
                ".es"
        );
        CountryDto italy = new CountryDto(
                "Italy",
                "Rome",
                "301,340km²",
                60_360_000L,
                "200 / km²",
                "Euro",
                "+39",
                "IT, ITA",
                ".it"
        );
        CountryDto mexico = new CountryDto(
                "Mexico",
                "Mexico City",
                "1,964,375km²",
                130_500_000L,
                "66 / km²",
                "Mexican Peso",
                "+52",
                "MX, MEX",
                ".mx"
        );
        CountryDto iran = new CountryDto(
                "Iran",
                "Tehran",
                "1,648,195km²",
                85_000_000L,
                "52 / km²",
                "Iranian Rial",
                "+98",
                "IR, IRN",
                ".ir"
        );
        CountryDto ukraine = new CountryDto(
                "Ukraine",
                "Kyiv",
                "603,628km²",
                43_500_000L,
                "72 / km²",
                "Ukrainian Hryvnia",
                "+380",
                "UA, UKR",
                ".ua"
        );
        CountryDto thailand = new CountryDto(
                "Thailand",
                "Bangkok",
                "513,120km²",
                70_000_000L,
                "136 / km²",
                "Thai Baht",
                "+66",
                "TH, THA",
                ".th"
        );
        CountryDto poland = new CountryDto(
                "Poland",
                "Warsaw",
                "312,679km²",
                38_000_000L,
                "123 / km²",
                "Polish złoty",
                "+48",
                "PL, POL",
                ".pl"
        );
        CountryDto indonesia = new CountryDto(
                "Indonesia",
                "Jakarta",
                "1,904,569km²",
                276_000_000L,
                "145 / km²",
                "Indonesian Rupiah",
                "+62",
                "ID, IDN",
                ".id"
        );

        CountryDto saudiArabia = new CountryDto(
                "Saudi Arabia",
                "Riyadh",
                "2,149,690km²",
                36_000_000L,
                "17 / km²",
                "Saudi Riyal",
                "+966",
                "SA, SAU",
                ".sa"
        );

        CountryDto egypt = new CountryDto(
                "Egypt",
                "Cairo",
                "1,002,450km²",
                106_500_000L,
                "106 / km²",
                "Egyptian Pound",
                "+20",
                "EG, EGY",
                ".eg"
        );
        CountryDto sweden = new CountryDto(
                "Sweden",
                "Stockholm",
                "450,295 km²",
                10_500_000L,
                "23 / km²",
                "Swedish Krona",
                "+46",
                "SE, SWE",
                ".se"
        );
        CountryDto chile = new CountryDto(
                "Chile",
                "Santiago",
                "756,102km²",
                19_200_000L,
                "25 / km²",
                "Chilean Peso",
                "+56",
                "CL, CHL",
                ".cl"
        );

        CountryDto france = new CountryDto(
                "France",
                "Paris",
                "643,801 km²",
                68_605_616L,
                "107 / km²",
                "Euro",
                "+33",
                "FR, FRA",
                ".fr"
        );

        CountryDto kenya = new CountryDto(
                "Kenya",
                "Nairobi",
                "580,367 km²",
                53_771_300L,
                "93 / km²",
                "Kenyan Shilling",
                "+254",
                "KE, KEN",
                ".ke"
        );

        CountryDto norway = new CountryDto(
                "Norway",
                "Oslo",
                "385,207 km²",
                5_514_042L,
                "14 / km²",
                "Norwegian Krone",
                "+47",
                "NO, NOR",
                ".no"
        );
        CountryDto vietnam = new CountryDto(
                "Vietnam",
                "Hanoi",
                "331,212 km²",
                98_858_950L,
                "298 / km²",
                "Vietnamese Dong",
                "+84",
                "VN, VNM",
                ".vn"
        );
        CountryDto philippines = new CountryDto(
                "Philippines",
                "Manila",
                "300,000 km²",
                117_337_368L,
                "391 / km²",
                "Philippine Peso",
                "+63",
                "PH, PHL",
                ".ph"
        );
        CountryDto greece = new CountryDto(
                "Greece",
                "Athens",
                "131,957 km²",
                10_300_000L,
                "78 / km²",
                "Euro",
                "+30",
                "GR, GRC",
                ".gr"
        );
        CountryDto malaysia = new CountryDto(
                "Malaysia",
                "Kuala Lumpur",
                "330,803 km²",
                34_300_000L,
                "104 / km²",
                "Malaysian Ringgit",
                "+60",
                "MY, MYS",
                ".my"
        );
        CountryDto peru = new CountryDto(
                "Peru",
                "Lima",
                "1,285,216 km²",
                34_000_000L,
                "26 / km²",
                "Peruvian Sol",
                "+51",
                "PE, PER",
                ".pe"
        );


        List<CountryDto> dtos = new ArrayList();

        dtos.add(india);
        dtos.add(nepal);
        dtos.add(zimbabwe);
        dtos.add(yemen);
        dtos.add(moldova);
        dtos.add(angola);
        dtos.add(lebanon);
        dtos.add(burkinaFaso);
        dtos.add(guinea);
        dtos.add(djibouti);
        dtos.add(senegal);
        dtos.add(switzerland);
        dtos.add(colombia);
        dtos.add(turkey);
        dtos.add(burkinaFas);
        dtos.add(japan);
        dtos.add(bangladesh);
        dtos.add(pakistan);
        dtos.add(nigeria);
        dtos.add(germany);
        dtos.add(brazil);
        dtos.add(argentina);
        dtos.add(australia);
        dtos.add(canada);
        dtos.add(southKorea);
        dtos.add(spain);
        dtos.add(italy);
        dtos.add(mexico);
        dtos.add(iran);
        dtos.add(ukraine);
        dtos.add(thailand);
        dtos.add(poland);
        dtos.add(indonesia);
        dtos.add(saudiArabia);
        dtos.add(egypt);
        dtos.add(sweden);
        dtos.add(chile);
        dtos.add(france);
        dtos.add(kenya);
        dtos.add(norway);
        dtos.add(vietnam);
        dtos.add(philippines);
        dtos.add(greece);
        dtos.add(malaysia);
        dtos.add(peru);


        System.out.println(dtos.size());

        for (CountryDto dto : dtos) {
            System.out.println(dto);
        }


    }
}
