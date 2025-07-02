package com.xworkz.accountdetails.dto;

import lombok.*;

@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class AccountDetailsDto {
    String givenName;
    String surName;
    String email;
    String password;
    String cnfPassword;
}
