package com.common.controller;


import com.common.model.Account;
import com.common.model.Address;
import com.common.model.Blocks;
import com.common.model.Contacts;
import com.common.model.CreditCardProfiles;
import com.common.model.GeneralData;
import com.common.model.MaterialExclusions;
import com.common.model.Partners;
import com.common.model.PhoneNumbers;
import com.common.model.PriceGroups;
import com.common.model.Programs;
import com.common.model.SalesArea;
import com.common.model.SalesData;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class ProfileController {

    @GetMapping("/account")
    public Account getAccount() {
        SalesArea salesArea = new SalesArea("SalesOrg1", "Channel1", "Division1");
        Address address = new Address("123 Street", "City", "State", "12345", "Country");
        PhoneNumbers phoneNumbers = new PhoneNumbers("123-456-7890", "098-765-4321", "111-222-3333");
        Contacts contacts = new Contacts("Primary Contact", "Secondary Contact");
        Partners partners = new Partners("PartnerId1", "PartnerName1");
        SalesData salesData = new SalesData("SalesGroup1", "SalesOffice1");
        GeneralData generalData = new GeneralData("General Info");
        Blocks blocks = new Blocks("Block Reason");
        Programs programs = new Programs("Program Name");
        PriceGroups priceGroups = new PriceGroups("Price Group Name");
        MaterialExclusions materialExclusions = new MaterialExclusions("Material");
        CreditCardProfiles creditCardProfiles = new CreditCardProfiles("1234-5678-9012-3456", "Visa", "12/25");

        return new Account(
                "AccountNumber1",
                "Account Name",
                salesArea,
                true,
                address,
                phoneNumbers,
                contacts,
                partners,
                salesData,
                generalData,
                blocks,
                programs,
                priceGroups,
                materialExclusions,
                creditCardProfiles
        );
    }
}