package com.thoughtworks.tdd;

import sun.security.krb5.internal.Ticket;
public class SmartParkingBoy extends ParkingBoy  {
    public SmartParkingBoy(ParkingLot parkingLot) {
        super(parkingLot);
    }

    @Override
    public Ticket parkCar(Car car) {
        return super.parkCar(car);
        int biggestRemainder = 0;
        int index = 0;
        for (int i = 0; i < parkingLots.size(); i++) {
            ParkingLot parkingLot = parkingLots.get(i);
            if (parkingLot.getRemainder() > biggestRemainder) {
                biggestRemainder = parkingLot.getRemainder();
                index = i;
            }
        }
        if(biggestRemainder==0){
            System.out.print("位置不足\n");
            return null;
        }
        return parkingLots.get(index).parkCar(car);

    }

}

