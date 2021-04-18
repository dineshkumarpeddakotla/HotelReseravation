package com.hotelreservation;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class HotelReservationSystem {
    //listOfHotels Dictionary is Created
    private static final Map<String, Hotel> listOfHotels = new HashMap<>();

    //Added Multiple Hotels
    Hotel lakewood = new Hotel("Lakewood",110, 90,3);
    Hotel bridgewood = new Hotel("Bridgewood", 150,50,4);
    Hotel ridgewood = new Hotel("Ridgewood", 220,150,5);

    //Added Hotels to listOfHotels
    public void addHotel() {
        listOfHotels.put("Lakewood", lakewood);
        listOfHotels.put("Bridgewood", bridgewood);
        listOfHotels.put("Ridgewood",ridgewood);
    }

    /**
     * Find the Cheapest Hotels and cost
     * @param checkInDate  Check In Date
     * @param checkOutDate Check Out Date
     * @return bestCheapestRatedHotel
     */
    public Map.Entry<String, Hotel> findBestCheapestRatedHotel(String checkInDate, String checkOutDate) {

        for(Map.Entry<String, Hotel> hotelEntry: listOfHotels.entrySet()) {
            calculateTotalPrice(checkInDate, checkOutDate, hotelEntry);
        }

        Map.Entry<String, Hotel> cheapestHotel =  listOfHotels.entrySet().stream()
                                                              .min(Comparator.comparing(hotel -> hotel.getValue().totalPrice))
                                                              .orElseThrow();
        Stream<Map.Entry<String, Hotel>> cheapestHotelStream = listOfHotels.entrySet().stream()
                                                                           .filter(hotel -> hotel.getValue().totalPrice == cheapestHotel.getValue().totalPrice);
        return cheapestHotelStream.max(Comparator.comparing(hotel -> hotel.getValue().getRating())).orElseThrow();
    }

    /**
     * Find the Cheapest Hotels and cost
     * @param checkInDate  Check In Date
     * @param checkOutDate Check Out Date
     * @return bestRatedHotel
     */
    public Map.Entry<String, Hotel> findBestRatedHotel(String checkInDate, String checkOutDate){
        for(Map.Entry<String, Hotel> hotelEntry: listOfHotels.entrySet()) {
            calculateTotalPrice(checkInDate, checkOutDate, hotelEntry);
        }
        return listOfHotels.entrySet().stream()
                           .max(Comparator.comparing(hotel -> hotel.getValue().getRating()))
                           .orElseThrow();
    }
    /**
     * Find the Cheapest Hotels and cost
     * @param checkInDate  Check In Date
     * @param checkOutDate Check Out Date
     * @param hotel Hotel
     */
    public void calculateTotalPrice(String checkInDate, String checkOutDate, Map.Entry<String, Hotel> hotel) {
        hotel.getValue().totalPrice = 0;

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate checkIn = LocalDate.parse(checkInDate, dateFormatter);
        LocalDate checkOut = LocalDate.parse(checkOutDate, dateFormatter);

        for(LocalDate date = checkIn; date.isBefore(checkOut)||date.isEqual(checkOut); date = date.plusDays(1)) {
            DayOfWeek day = date.getDayOfWeek();

            if(day.toString().equals("SUNDAY") || day.toString().equals("SATURDAY")) {
                hotel.getValue().totalPrice = hotel.getValue().totalPrice + hotel.getValue().getWeekendPrice();
            } else {
                hotel.getValue().totalPrice = hotel.getValue().totalPrice + hotel.getValue().getWeekdayPrice();
            }
        }
    }

    public void print(){
        listOfHotels.forEach((key, value) -> System.out.println(value));
    }
}
