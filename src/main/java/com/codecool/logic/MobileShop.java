package com.codecool.logic;

import com.codecool.data.phone.Phone;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MobileShop {
    private final Set<Phone> phones;
    private final Map<LocalDate, Double> dailyRevenue;
    private double currentDailyRevenue;

    public MobileShop() {
        this.phones = new HashSet<>();
        this.dailyRevenue = new HashMap<>();
        currentDailyRevenue = 0;
    }

    public void addPhone(Phone phone) {
        this.phones.add(phone);
    }

    public void closeDay() {
        dailyRevenue.put(LocalDate.now(), currentDailyRevenue);
        currentDailyRevenue = 0;
    }

    public void sellPhone(Phone phone) {
        currentDailyRevenue += phone.getRevenue();
        phones.remove(phone);
    }

    public boolean buyPhone(Phone phone) {
        if(phone.isUsed() && currentDailyRevenue > phone.getBuyingPrice()) {
            phones.add(phone);
            currentDailyRevenue -= phone.getBuyingPrice();
            return true;
        }
        return false;
    }

    public boolean isNewPhoneRevenueHigherThanOldPhoneRevenue() {
        return calculateNewPhoneRevenue() > calculateOldPhoneRevenue();
    }

    private double calculateOldPhoneRevenue() {
        return phones.stream().filter(Phone::isUsed).mapToDouble(Phone::getRevenue).sum();
    }

    private double calculateNewPhoneRevenue() {
        return phones.stream().filter(phone -> !phone.isUsed()).mapToDouble(Phone::getRevenue).sum();
    }
}
