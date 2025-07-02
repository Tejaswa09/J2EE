package com.xworkz.accountdetails.repository;

import com.xworkz.accountdetails.dto.AccountDetailsDto;

public interface AccountDetailsRepository {
    boolean save(AccountDetailsDto dto);
    boolean update(String givenName,String email);

    boolean delete(String givenName);

    AccountDetailsDto detailsByName(String givenName);

    AccountDetailsDto[] getAllDetails();
}
