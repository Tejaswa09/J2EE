package com.xworkz.accountdetails.service;

import com.xworkz.accountdetails.dto.AccountDetailsDto;
import com.xworkz.accountdetails.servlets.UpdateServlet;

public interface AccountDetailsService {
    boolean validateAndSave(AccountDetailsDto dto);
    boolean validateAndUpdateEmailByName(String givenName,String email);
    boolean validateAndDelete(String givenName);
    AccountDetailsDto detailsReturned(String givenName);

    AccountDetailsDto[] getAllUser();
}
