package com.example.vehiclemonodb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@NoArgsConstructor
@AllArgsConstructor
@Data


@Document
public class Vehicle
{
    @Id
    private Integer vehicleId;
    private String vehicleType;
    private String vehicleColor;

}
