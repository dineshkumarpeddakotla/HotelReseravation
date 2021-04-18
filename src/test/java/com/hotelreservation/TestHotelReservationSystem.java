package com.hotelreservation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
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
    public void givenRangeOfDatesReturnCheapestHotelAtThatPeriod() {
        HotelReservationSystem hotelReservationSystem = new HotelReservationSystem();
        hotelReservationSystem.addHotel();

        List<Map.Entry<String, Hotel>> cheapestHotel = hotelReservationSystem.findCheapestHotel("11/09/2020", "12/09/2020");

        System.out.println(cheapestHotel);

        Assertions.assertEquals("[Bridgewood=Hotel{HotelName ='Bridgewood', Total Price = $200}," +
                                " Lakewood=Hotel{HotelName ='Lakewood', Total Price = $200}]", cheapestHotel.toString());
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
