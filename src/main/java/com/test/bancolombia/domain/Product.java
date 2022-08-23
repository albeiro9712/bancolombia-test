package com.test.bancolombia.domain;

import java.io.Serializable;

import com.amazonaws.services.dynamodbv2.datamodeling.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamoDBTable(tableName = "Products")
public class Product implements Serializable{
    
    @DynamoDBHashKey(attributeName = "ProductId")
    private Integer productId;

    @DynamoDBAttribute
    private String productType;

    @DynamoDBAttribute
    private String productName;

    @DynamoDBAttribute
    private String productDescription;

    @DynamoDBAttribute
    private Double productPrice;
}
