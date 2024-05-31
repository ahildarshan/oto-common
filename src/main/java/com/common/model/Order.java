package com.common.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    private String salesOrg;
    private String orderNumber;
    private String docInfo;
    private String status;
    private String orderDate;
    private String orderRequestDate;
    private String purchaseOrderNumber;
    private String processingStatus;
    private String goodsMovementStatus;
    private String reasonCode;
    private String netValue;
    private String cancelDate;
    private String inHandDate;
    private String edit;
    private String account;
    private String minRequestDate;
}
