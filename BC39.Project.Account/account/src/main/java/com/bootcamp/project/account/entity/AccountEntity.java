package com.bootcamp.project.account.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Account")
public class AccountEntity {
    @Id
    private String accountNumber;
    private String idProduct;
    private String clientDocumentNumber;
    private double balance;
    private double operationalDebt;
    private Date createDate;
    private Date modifyDate;
    private List<Person> owners;
    private List<Person> signatories;
    /*Temp */
    private String clientType;
    private String clientSubType;
    private String productCode;
    private double minimumOpeningAmount;
    private double minimumDailyAmount;
    private double maintenanceCost;
    private int maxOperations;
    private int maxFreeOperations;
    private int operationDay;
    /*Temp */
}