package com.thoughtworks.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import sun.security.krb5.internal.Ticket;

import java.util.Map;


public class ParkingBoyTest {
    private Manager manager;

    @Test
    public void should_return_Ticket_when_park_a_Car() {
//given
        Car car = new Car();
        ParkingBoy parkingBoy = new ParkingBoy();
//when
        Ticket ticket = parkingBoy.parkCar(car);
//then
        Assertions.assertNotNull(ticket);
    }

    @Test
    public void should_return_Car_when_fetchCar_given_Ticket() {
//given
        ParkingLot parkingLot = new ParkingLot();
        ParkingBoy parkingBoy = new ParkingBoy(parkingLot);
        Car car = new Car();
//when
        Ticket ticket = parkingBoy.parkCar();
//then
        Assertions.assertEquals(car, parkingLot.fetchCar(ticket));
    }
    @Test
    public void should_return_right_Cars_when_fetchCar_given_right_Tickets() {
//given
        ParkingLot parkingLot = new ParkingLot();
        ParkingBoy parkingBoy = new ParkingBoy(parkingLot);
//when
        Car car1 = new Car();
        Ticket ticket1 = parkingBoy.parkCar(car1);
        Car car2 = new Car();
        Ticket ticket2 = parkingBoy.parkCar(car2);
//then
        Assertions.assertEquals(car1, parkingLot.fetchCar(ticket1));
        Assertions.assertEquals(car2, parkingLot.fetchCar(ticket2));
    }
    @Test
    public void should_return_null_when_fetchCar_given_null() {
//given
        ParkingLot parkingLot = new ParkingLot();
        ParkingBoy parkingBoy = new ParkingBoy(parkingLot);
//when
        Car car1 = new Car();
        Ticket ticket1 = parkingBoy.parkCar(car1);
        Car car = parkingBoy.fetchCar(null);
//then
        Assertions.assertNull(car);
    }
    @Test
    public void should_return_null_when_fetchCar_given_usedTicket() {
//given
        ParkingLot parkingLot = new ParkingLot();
        ParkingBoy parkingBoy = new ParkingBoy(parkingLot);
//when
        Car car1 = new Car();
        Ticket ticket1 = parkingBoy.parkCar(car1);
        parkingBoy.fetchCar(ticket1);
        Car result = parkingBoy.fetchCar(ticket1);
//then
        Assertions.assertNull(result);
    }

    @Test
    public void should_return_null_when_parkCar_given_the_full_parkinglot() {
//given
        Map<Ticket, Car> storeCars;
        int capacity;
        ParkingLot parkingLot = new ParkingLot(2, capacity, storeCars, manager);
        ParkingBoy parkingBoy = new ParkingBoy(parkingLot);
//when
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        parkingBoy.parkCar(car1);
        parkingBoy.parkCar(car2);
        Ticket result = parkingBoy.parkCar(car3);
//then
        Assertions.assertNull(parkingBoy.fetchCar(result));
    }
    @Test
    public void should_return_null_when_parkCar_given_the_parkedCar() {
//given
        ParkingLot parkingLot = new ParkingLot();
        ParkingBoy parkingBoy = new ParkingBoy(parkingLot);
//when
        Car car1 = new Car();;
        parkingBoy.parkCar(car1);
        Ticket result = parkingBoy.parkCar(car1);
//then
        Assertions.assertNull(result);
    }
    @Test
    public void should_return_null_when_parkCar_given_the_nullCar() {
//given
        ParkingLot parkingLot = new ParkingLot();
        ParkingBoy parkingBoy = new ParkingBoy(parkingLot);
//when
        Car car1 = new Car();
        parkingBoy.parkCar(car1);
        Ticket result = parkingBoy.parkCar(null);
//then
        Assertions.assertNull(result);
    }



}




