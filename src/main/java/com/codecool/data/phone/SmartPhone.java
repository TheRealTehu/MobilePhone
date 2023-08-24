package com.codecool.data.phone;

import com.codecool.data.phone.phonetype.PhoneType;

public class SmartPhone extends Phone{
    private final Break breakPhone;

    public SmartPhone(int batteryCapacity, int memoryCapacity, Break breakPhone, PhoneType phoneType) {
        super(batteryCapacity, memoryCapacity, phoneType);
        this.breakPhone = breakPhone;
    }

    public void breakPhone() {
        breakPhone.breakPhone();
    }

    public boolean isBroken() {
        return breakPhone.isBroken();
    }
}
