package com.common.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SalesArea {
    private String salesOrg;
    private String distributionChannel;
    private String division;
}