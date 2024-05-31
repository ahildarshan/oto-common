package com.common.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    private String accountNumber;
    private String name;
    private SalesArea salesArea;
    private boolean active;
    private Address address;
    private PhoneNumbers phoneNumbers;
    private Contacts contacts;
    private Partners partners;
    private SalesData salesData;
    private GeneralData generalData;
    private Blocks blocks;
    private Programs programs;
    private PriceGroups priceGroups;
    private MaterialExclusions materialExclusions;
    private CreditCardProfiles creditCardProfiles;
}