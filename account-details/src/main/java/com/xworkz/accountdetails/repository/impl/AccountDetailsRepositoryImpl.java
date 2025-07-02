package com.xworkz.accountdetails.repository.impl;

import com.xworkz.accountdetails.dto.AccountDetailsDto;
import com.xworkz.accountdetails.repository.AccountDetailsRepository;

import java.sql.*;

public class AccountDetailsRepositoryImpl implements AccountDetailsRepository {
    int index = 1;
    AccountDetailsDto[] dtos;
    @Override
    public boolean save(AccountDetailsDto dto) {
        System.out.println("Repository entry\n");
        boolean isDetailsSaved = false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("registersucces");
            Connection connection = DriverManager.
                    getConnection("jdbc:mysql://localhost:3306/accounts", "root", "Tejaswa7899@!#");
            System.out.println("connection sucess");


            String insertStatement = "insert into user_details (Given_name,Sur_name,Email,Password,Cnf_Password) values (?,?,?,?,?)";

            PreparedStatement statement = connection.prepareStatement(insertStatement);
            statement.setString(1, dto.getGivenName());
            statement.setString(2, dto.getSurName());
            statement.setString(3, dto.getEmail());
            statement.setString(4, dto.getPassword());
            statement.setString(5, dto.getCnfPassword());

            System.out.println(statement.executeUpdate());
            statement.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Repository exit");
        return isDetailsSaved;
    }

    @Override
    public boolean update(String givenName, String email) {
        boolean isUpdated = false;
        try {
            System.out.println("enter repo");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/accounts", "root", "Tejaswa7899@!#");
            System.out.println("connection established");
            PreparedStatement query = conn.prepareStatement("UPDATE user_details SET Email = ? WHERE Given_Name = ?");
            query.setString(1, email);
            query.setString(2, givenName);
            int noOfRowsEffected = query.executeUpdate();
            System.out.println("query executed");
            if (noOfRowsEffected > 0) {
                isUpdated = true;
            }
            query.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("repo exit");
        return isUpdated;
    }

    public boolean delete(String givenName) {
        boolean isDeleted = false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/accounts", "root", "Tejaswa7899@!#");
            PreparedStatement query = conn.prepareStatement("delete from user_details where Given_Name = ?");
            query.setString(1, givenName);
            query.executeUpdate();

            query.close();
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        return isDeleted;
    }

    @Override
    public AccountDetailsDto detailsByName(String givenName) {
        AccountDetailsDto dto = new AccountDetailsDto();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/accounts", "root", "Tejaswa7899@!#");
            PreparedStatement query = con.prepareStatement("select * from user_details where Given_Name=?");
            query.setString(1, givenName);
            ResultSet resultSet = query.executeQuery();

            while (resultSet.next()) {
                dto.setGivenName(resultSet.getString("Given_Name"));
                dto.setSurName(resultSet.getString("Sur_Name"));
                dto.setEmail(resultSet.getString("Email"));
                dto.setPassword(resultSet.getString("Password"));
                dto.setCnfPassword(resultSet.getString("Cnf_Password"));
                System.out.println("dto on repo" + dto);


            }

            resultSet.close();
            query.close();
            con.close();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        System.out.println(dto);
        return dto;
    }

    @Override
    public AccountDetailsDto[] getAllDetails() {
        int count = 1;
        System.out.println("Enters repo");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/accounts", "root", "Tejaswa7899@!#");
            System.out.println("Connection established");
            PreparedStatement query = con.prepareStatement("select * from user_details");
            System.out.println("sql excecuted");
            ResultSet resultSet = query.executeQuery();
            while (resultSet.next()) {
                count++;
            }
            dtos = new AccountDetailsDto[count];
            resultSet = query.executeQuery();
            int index = 1;
            while (resultSet.next()){
                AccountDetailsDto dto = new AccountDetailsDto();
                dto.setGivenName(resultSet.getString(1));
                dto.setSurName(resultSet.getString(2));
                dto.setEmail(resultSet.getString(3));
                dtos[index++]=dto;
                System.out.println("dtos returned");
            }
            resultSet.close();
            query.close();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
       return dtos;
    }

}
