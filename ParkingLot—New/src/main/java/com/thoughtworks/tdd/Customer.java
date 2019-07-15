package com.thoughtworks.tdd;

public class Customer {
    private Car car;//客户所拥有的车
    private Ticket ticket;//客户停车所获得的小票

    public void parkCar(ParkingBoy parkingBoy) {

        if (ticket != null) {
            setCar(null);
            setTicket(ticket);
        }
    }

    public void fetchCar(ParkingBoy parkingBoy) {
        Car car = parkingBoy.fetchCar(ticket);
        if (car != null) {
            setCar(car);
            setTicket(null);
        }
    }

    public void buyCar(Car car) {
        setCar(car);
    }

    public Customer() {
    }

    public Customer(Car car) {
        this.car = car;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Ticket getTicket() {
        return ticket;
    }

    
}
