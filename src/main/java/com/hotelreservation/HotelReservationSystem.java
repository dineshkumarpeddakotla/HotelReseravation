package com.hotelreservation;

import java.util.HashMap;
import java.util.Map;

public class HotelReservationSystem {
    private static final Map<String, Hotel> hotelList = new HashMap<>();

    Hotel lakewood = new Hotel();
    Hotel bridgewood = new Hotel();
    Hotel ridgewood = new Hotel();

    public void addHotel() {
        lakewood.setHotelName("Lakewood");
        lakewood.setPrice(110);

        bridgewood.setHotelName("Bridgewood");
        bridgewood.setPrice(160);

        ridgewood.setHotelName("Ridgewood");
        ridgewood.setPrice(220);

        hotelList.put("Lakewood", lakewood);
        hotelList.put("Bridgewood", bridgewood);
        hotelList.put("Ridgewood",ridgewood);
    }
    public void print(){
        hotelList.forEach((key, value) -> System.out.println(value));
    }

}
