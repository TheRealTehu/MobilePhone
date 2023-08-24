package com.codecool.data.phone;

import com.codecool.data.phone.phonetype.PhoneType;
import com.codecool.data.phone.phonetype.UsedPhone;

import java.util.UUID;

public abstract class Phone {
    private final UUID id;
    private final int batteryCapacity;
    private final int memoryCapacity;

    private PhoneType phoneType;

    public Phone(int batteryCapacity, int memoryCapacity, PhoneType phoneType) {
        this.id = UUID.randomUUID();
        this.batteryCapacity = batteryCapacity;
        this.memoryCapacity = memoryCapacity;
        this.phoneType = phoneType;
    }

    public boolean isUsed() {
        return phoneType instanceof UsedPhone;
    }

    public double getRevenue() {
        return phoneType.calculateRevenue();
    }

    public double getBuyingPrice() {
        if(isUsed()) {
            return ((UsedPhone) phoneType).getBuyingPrice();
        }
        return 0;
    }
}
