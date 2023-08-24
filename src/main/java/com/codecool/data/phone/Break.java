package com.codecool.data.phone;

public class Break {
    private boolean isBroken;

    public Break() {
        this.isBroken = false;
    }

    public void breakPhone() {
        this.isBroken = true;
    }

    public boolean isBroken() {
        return isBroken;
    }
}
