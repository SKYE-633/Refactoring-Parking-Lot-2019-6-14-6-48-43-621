package com.thoughtworks.tdd;

public class Ticket {
    private boolean isUsed;
    public void useTicket() {
        isUsed = true;
    }

    public boolean isUsed() {
        return isUsed;
    }

    public Ticket(Car car) {
        isUsed = false;
    }

}
