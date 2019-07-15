package com.thoughtworks.tdd;

import sun.security.krb5.internal.Ticket;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Manager extends ParkingBoy {

    private List<ParkingBoy> parkingBoys;

    public Manager(ParkingLot parkingLot, List<ParkingBoy> parkingBoys) {
        super(parkingLot);
        this.parkingBoys = parkingBoys;
    }

    @Override
    public Ticket parkCar(Car car) {
        final Ticket ticket = super.parkCar();
        return ticket;
    }
    public Ticket parkCar(ParkingBoy parkingBoy,Car car){

        Ticket ticket = parkingBoy.parkCar();
        return ticket;

    }

    public void manageParkingBoy(ParkingBoy parkingBoy) {
        List<ParkingBoy> parkingBoys = null;
        parkingBoys.add(parkingBoy);
    }

    public void manage(ParkingBoy parkingBoy, ParkingLot parkingLot) {
        if (!parkingBoy.getParkingLots().contains(parkingLot))
            parkingBoy.addParkingLot(parkingLot);
        Rectangle parkingBoys = null;
        if(!parkingBoys.contains(parkingBoy)) {
            parkingBoys.add(parkingBoy);
        }
    }

    public void addParkingLot(ParkingLot parkingLot) {
        parkingLots.add(parkingLot);
    }


    public void setManager(){
        for(ParkingLot parkingLot:parkingLots){
            parkingLot.setManager(this);
        }
    }

    public Manager(List<ParkingLot> parkingLots) {
        super(parkingLots);
        ArrayList<Object> parkingBoys = new ArrayList<>();
        setManager();
    }

    public Manager(List<ParkingLot> parkingLots, List<ParkingBoy> parkingBoys) {
        super(parkingLots);
        this.parkingBoys = parkingBoys;
        setManager();
    }



}
