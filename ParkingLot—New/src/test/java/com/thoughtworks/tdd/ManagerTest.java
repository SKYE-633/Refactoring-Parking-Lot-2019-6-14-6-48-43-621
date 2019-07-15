package com.thoughtworks.tdd;

import org.junit.jupiter.api.Test;
import sun.security.krb5.internal.Ticket;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static sun.nio.cs.Surrogate.is;

public class ManagerTest {
    @Test
    public void should_return_Ticket_when_parkCar_given_Car() {
//given
        ParkingLot parkingLot1 = new ParkingLot();
        ParkingLot parkingLot2 = new ParkingLot(4);
        List<ParkingLot> managerParkingLots = new ArrayList<>();
        managerParkingLots.add(parkingLot1);
        managerParkingLots.add(parkingLot2);
        List<ParkingLot> boyParkingLots = new ArrayList<>();
        boyParkingLots.add(parkingLot1);
        Manager manager = new Manager(managerParkingLots);
        ParkingBoy parkingBoy = new ParkingBoy(boyParkingLots);
        manager.manageParkingBoy(parkingBoy);

//when
        Ticket ticket1 = manager.parkCar(parkingBoy, new Car());

//then
        assertNotNull(ticket1);
        assertThat(manager.getParkingLots().get(0).getStoreCars().size(), is(1));
        assertThat(manager.getParkingLots().get(1).getStoreCars().size(), is(0));
        assertEquals(manager.getParkingLots().get(0), parkingBoy.getParkingLots().get(0));
    }

}