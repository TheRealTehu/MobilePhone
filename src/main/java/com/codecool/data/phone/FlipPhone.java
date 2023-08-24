package com.codecool.data.phone;

import com.codecool.data.phone.phonetype.PhoneType;

public class FlipPhone extends FeaturePhone {
    private final Break phoneBreak;

    public FlipPhone(int batteryCapacity, int memoryCapacity, Break phoneBreak, PhoneType phoneType) {
        super(batteryCapacity, memoryCapacity, phoneType);
        this.phoneBreak = phoneBreak;
    }

    public void breakPhone() {
        phoneBreak.breakPhone();
    }

    public boolean isBroken() {
        return phoneBreak.isBroken();
    }
}
