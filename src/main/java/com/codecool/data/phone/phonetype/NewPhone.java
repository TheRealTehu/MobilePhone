package com.codecool.data.phone.phonetype;

public class NewPhone extends PhoneType {
    private static final double REVENUE_PERCENTAGE = 0.8;

    public NewPhone(double sellingPrice) {
        super(sellingPrice);
    }

    @Override
    public double calculateRevenue() {
        return sellingPrice * REVENUE_PERCENTAGE;
    }
}
