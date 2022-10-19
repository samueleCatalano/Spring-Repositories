package com.repositories.repositories;

import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NonNull
    private String modelName;
    @NonNull
    private String serialNumber;
    @NonNull
    private double currentPrice;

    public Car(Long id, @NonNull String modelName, @NonNull String serialNumber, double currentPrice) {
        this.id = id;
        this.modelName = modelName;
        this.serialNumber = serialNumber;
        this.currentPrice = currentPrice;
    }

    public Car() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @NonNull
    public String getModelName() {
        return modelName;
    }

    public void setModelName(@NonNull String modelName) {
        this.modelName = modelName;
    }

    @NonNull
    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(@NonNull String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }
}
