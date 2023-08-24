package com.codecool.data.phone.phonetype;

public abstract class PhoneType {
    protected double sellingPrice;

    public PhoneType(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public abstract double calculateRevenue();
}
