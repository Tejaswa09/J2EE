package com.xworkz.accountdetails.service.impl;

import com.xworkz.accountdetails.dto.AccountDetailsDto;
import com.xworkz.accountdetails.repository.AccountDetailsRepository;
import com.xworkz.accountdetails.repository.impl.AccountDetailsRepositoryImpl;
import com.xworkz.accountdetails.service.AccountDetailsService;

public class AccountDetailsServiceImp implements AccountDetailsService {
    AccountDetailsRepository repository;

    public AccountDetailsServiceImp() {
        repository = new AccountDetailsRepositoryImpl();
    }

    @Override
    public boolean validateAndSave(AccountDetailsDto dto) {
        System.out.println("service enter\n");
        boolean isDetailsValidated = false;
        boolean isGivenNameValid = false;
        boolean isSurNameValid = false;
        boolean isEmailValid = false;
        boolean isPasswordValid = false;
        boolean isCnfPasswordValid = false;
        if (dto.getGivenName() != null && !dto.getGivenName().isEmpty()) {
            isGivenNameValid = true;
        }
        if (dto.getSurName() != null && !dto.getSurName().isEmpty()) {
            isSurNameValid = true;
        }
        if (dto.getEmail() != null && !dto.getEmail().isEmpty()) {
            isEmailValid = true;
        }
        if (dto.getPassword() != null && !dto.getPassword().isEmpty()) {
            isPasswordValid = true;
        }
        if (dto.getCnfPassword() != null && !dto.getCnfPassword().isEmpty()) {
            isCnfPasswordValid = true;
        }
        if (isGivenNameValid && isSurNameValid && isEmailValid && isPasswordValid && isCnfPasswordValid) {
            isDetailsValidated = repository.save(dto);
        }
        System.out.println("service exit\n");
        return isDetailsValidated;


    }

    @Override
    public boolean validateAndUpdateEmailByName(String givenName, String email) {
        boolean isValidatesAndUpdated = false;
        System.out.println("enters the updateService");
        if (givenName!=null && !givenName.isEmpty() && email!=null && !email.isEmpty()){
            isValidatesAndUpdated = repository.update(givenName,email);
        }
        System.out.println("exit service");
        return isValidatesAndUpdated;

    }

    @Override
    public boolean validateAndDelete(String givenName) {
        boolean isValidatedAndDeleted= false;
        if(givenName != null && !givenName.isEmpty()){
            isValidatedAndDeleted = repository.delete(givenName);
        }
        return isValidatedAndDeleted;
    }

    @Override
    public AccountDetailsDto detailsReturned(String givenName) {
        AccountDetailsDto dto = new AccountDetailsDto();
        dto.getGivenName();
        dto.getSurName();
        dto.getEmail();
        if(givenName!=null && !givenName.isEmpty()){
          dto=repository.detailsByName(givenName);
            System.out.println("dto in service"+dto);
        }
        System.out.println("dto in service"+dto);
        return dto;
    }

    @Override
    public AccountDetailsDto[] getAllUser() {
        System.out.println("enters service\n");
       return repository.getAllDetails();
    }


}
