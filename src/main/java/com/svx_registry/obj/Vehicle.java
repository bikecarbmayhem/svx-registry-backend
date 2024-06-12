package com.svx_registry.obj;



import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Vehicle {
    private long frame;

    private String vin;

    private String factory;

    private String market;

    private int year;

    private String color;

    private String grade;

    private boolean pendingVerification;

    private long mileage;

}
