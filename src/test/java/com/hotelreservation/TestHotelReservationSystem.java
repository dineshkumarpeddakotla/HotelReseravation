package com.hotelreservation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;

public class TestHotelReservationSystem {

    @Test
    public void whenHotelIsAddedToHotelList(){
        HotelReservationSystem hotelReservationSystem = new HotelReservationSystem();

        hotelReservationSystem.addHotel();

        String hotelName = hotelReservationSystem.ridgewood.getHotelName();
        Integer hotelPrice = hotelReservationSystem.ridgewood.getWeekdayPrice();

        System.out.print(hotelName);
        System.out.println(" Price is $" +hotelPrice);
        hotelReservationSystem.print();

        Assertions.assertEquals("Ridgewood", hotelName );
        Assertions.assertEquals(220, hotelPrice);
    }
//
//    @Test
//    public void givenRangeOfDateShouldReturnCheapestHotelAtThatPeriod() {
//        HotelReservationSystem hotelReservationSystem = new HotelReservationSystem();
//        hotelReservationSystem.addHotel();
//
//        String cheapestHotel = hotelReservationSystem.findCheapestHotel("10/09/2020", "11/09/2020");
//
//        System.out.println(cheapestHotel);
//
//        Assertions.assertEquals("Lakewood, Total Price = $220", cheapestHotel);
//    }

    @Test
    public void whenWeekdayAndWeekendPricesIsAddedToHotelList(){
        HotelReservationSystem hotelReservationSystem = new HotelReservationSystem();

        hotelReservationSystem.addHotel();

        String hotelName = hotelReservationSystem.ridgewood.getHotelName();
        Integer hotelPrice = hotelReservationSystem.ridgewood.getWeekdayPrice();

        Assertions.assertEquals("Ridgewood", hotelName );
        Assertions.assertEquals(220, hotelPrice);
    }

    @Test
    public void givenRangeOfDatesReturnBestCheapestRatedHotelAtThatPeriod() {
        HotelReservationSystem hotelReservationSystem = new HotelReservationSystem();
        hotelReservationSystem.addHotel();

        Map.Entry<String, Hotel> cheapestHotel = hotelReservationSystem.findBestCheapestRatedHotel("11/09/2020", "12/09/2020");

        System.out.println(cheapestHotel);

        Assertions.assertEquals("Bridgewood=Hotel{hotelName='Bridgewood', totalPrice=200, rating=4}", cheapestHotel.toString());
    }

    @Test
    public void whenRatingOfHotelIsAddedToList(){
        HotelReservationSystem hotelReservationSystem = new HotelReservationSystem();

        hotelReservationSystem.addHotel();

        String hotelName = hotelReservationSystem.ridgewood.getHotelName();
        Integer hotelPrice = hotelReservationSystem.ridgewood.getRating();

        Assertions.assertEquals("Ridgewood", hotelName );
        Assertions.assertEquals(5, hotelPrice);
    }
}
