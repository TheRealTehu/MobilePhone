package com.codecool.data.phone.phonetype;

public class UsedPhone extends PhoneType {
    private double buyingPrice;

    public UsedPhone(double sellingPrice, double buyingPrice) {
        super(sellingPrice);
        this.buyingPrice = buyingPrice;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    @Override
    public double calculateRevenue() {
        return sellingPrice - buyingPrice;
    }
}
