package com.thoughtworks.tdd;



import java.util.List;
import java.util.Map;

public class ParkingLot {
    private int capacity;
    private Map<Ticket, Car> storeCars;
    private Manager manager;

    public ParkingLot(int i, int capacity, Map<Ticket, Car> storeCars, Manager manager) {
        this.capacity = capacity;
        this.storeCars = storeCars;
        this.manager = manager;
    }

    public ParkingLot() {

    }

    public boolean isFull() {
        int capacity = 0;
        return storeCars.size() >= capacity;
    }

    public Ticket parkCar(Car car) {
        if (car == null) {
            System.out.print("请提供您的停车票\n");
            return null;
        }
        for (Ticket ticket : storeCars.keySet()) {
            if (storeCars.get(ticket).equals(car)) {
                System.out.print("这辆车已经停过了\n");
                return null;
            }
        }
        return null;
    }
    public Car fetchCar(Ticket ticket) {
            Car fetchCar = null;
            if (ticket == null) {
                System.out.print("未识别的停车单\n");
                return null;
            }
            return null;
        }

    



    public void setManager(Manager manager) {
    }

    public boolean getRemainder() {
        return false;
    }

    public Map<Ticket, ParkingLot> getStoreCars() {
        return null;
    }
}




