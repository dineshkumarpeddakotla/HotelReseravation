package com.hotelreservation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestHotelReservationSystem {

    @Test
    public void whenHotelIsAddedToHotelList(){
        HotelReservationSystem hotelReservationSystem = new HotelReservationSystem();

        hotelReservationSystem.addHotel();

        String hotelName = hotelReservationSystem.ridgewood.getHotelName();
        Integer hotelPrice = hotelReservationSystem.ridgewood.getPrice();

        System.out.print(hotelName);
        System.out.println(" Price is $" +hotelPrice);
        hotelReservationSystem.print();

        Assertions.assertEquals("Ridgewood", hotelName );
        Assertions.assertEquals(220, hotelPrice);
    }

    @Test
    public void givenRangeOfDates_returnCheapestHotelAtThatPeriod() {
        HotelReservationSystem hotelReservationSystem = new HotelReservationSystem();
        hotelReservationSystem.addHotel();

        String cheapestHotel = hotelReservationSystem.findCheapestHotel("10/09/2020", "11/09/2020");

        System.out.println(cheapestHotel);

        Assertions.assertEquals("Lakewood, Total Price = $220", cheapestHotel);
    }
}
