package com.thoughtworks.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingLotTest {
    @Test
    public void should_return_right_car_when_fetchCar_given_the_right_ticket() {
//given
        ParkingLot parkingLot = new ParkingLot();
        Car car = new Car();
//when
        Ticket ticket = parkingLot.parkCar(car);
//then
        assertEquals(car,parkingLot.fetchCar(ticket));
    }
//    @Test
//    public void should_return_null_when_fetchCar_given_the_full_storage() {
////given
//        ParkingLot parkingLot = new ParkingLot(1, capacity, storeCars, manager);
//        Car car1 = new Car();
//        Car car2 = new Car();
////when
//        Ticket ticket1 = parkingLot.parkCar(car1);
//        Ticket ticket2 = parkingLot.parkCar(car2);
////then
//        assertEquals(car1,parkingLot.fetchCar(ticket1));
//        assertNull(parkingLot.fetchCar(ticket2));
//    }

//    @Test
//    public void should_decrease_storage_when_fetchCar() {
////given
//        ParkingLot parkingLot = new ParkingLot(1, capacity, storeCars, manager);
//        Car car1 = new Car();
//        Car car2 = new Car();
////when
//        Ticket ticket1 = parkingLot.parkCar(car1);
//        parkingLot.fetchCar(ticket1);
//        Ticket ticket2 = parkingLot.parkCar(car2);
////then
//        assertNotNull(ticket2);
//    }




}