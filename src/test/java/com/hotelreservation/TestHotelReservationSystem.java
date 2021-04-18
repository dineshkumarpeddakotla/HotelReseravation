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

        Assertions.assertEquals("Ridgewood", hotelName );
        Assertions.assertEquals(220, hotelPrice);
    }

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
    public void whenRatingOfHotelIsAddedToList(){
        HotelReservationSystem hotelReservationSystem = new HotelReservationSystem();

        hotelReservationSystem.addHotel();

        String hotelName = hotelReservationSystem.ridgewood.getHotelName();
        Integer hotelPrice = hotelReservationSystem.ridgewood.getRating();

        Assertions.assertEquals("Ridgewood", hotelName );
        Assertions.assertEquals(5, hotelPrice);
    }

    @Test
    public void givenRangeOfDatesReturnBestCheapestRatedHotelAtThatPeriod() {
        HotelReservationSystem hotelReservationSystem = new HotelReservationSystem();
        hotelReservationSystem.addHotel();

        Map.Entry<String, Hotel> cheapestHotel = hotelReservationSystem.findBestCheapestRatedHotel("11/09/2020", "12/09/2020");

        System.out.println(cheapestHotel);

        Assertions.assertEquals("Bridgewood=Hotel{hotelName='Bridgewood', totalPrice = $200, rating = 4}", cheapestHotel.toString());
    }

    @Test
    public void givenRangeOfDatesReturnBestRatedHotelAtThatPeriod() {
        HotelReservationSystem hotelReservationSystem = new HotelReservationSystem();
        hotelReservationSystem.addHotel();

        Map.Entry<String, Hotel> bestRatedHotel = hotelReservationSystem.findBestRatedHotel("11/09/2020", "12/09/2020");

        System.out.println(bestRatedHotel);

        Assertions.assertEquals("Ridgewood=Hotel{hotelName='Ridgewood', totalPrice = $370, rating = 5}", bestRatedHotel.toString());
    }

    @Test
    public void whenRewardCustomerPricesOfHotelIsAddedToList(){
        HotelReservationSystem hotelReservationSystem = new HotelReservationSystem();

        hotelReservationSystem.addHotel();

        String hotelName = hotelReservationSystem.ridgewood.getHotelName();
        Integer weekdayRewardCustomerPrice = hotelReservationSystem.ridgewood.getWeekdayRewardCustomerPrice();
        Integer weekendRewardCustomerPrice = hotelReservationSystem.ridgewood.getWeekendRewardCustomerPrice();

        Assertions.assertEquals("Ridgewood", hotelName );
        Assertions.assertEquals(100,weekdayRewardCustomerPrice);
        Assertions.assertEquals(40, weekendRewardCustomerPrice);
    }
}
