package com.hotelreservation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class HotelReservationSystem {
    private static final Map<String, Hotel> listOfHotels = new HashMap<>();

    Hotel lakewood = new Hotel("Lakewood",110);
    Hotel bridgewood = new Hotel("Bridgewood", 160);
    Hotel ridgewood = new Hotel("Ridgewood", 220);

    public void addHotel() {
        listOfHotels.put("Lakewood", lakewood);
        listOfHotels.put("Bridgewood", bridgewood);
        listOfHotels.put("Ridgewood",ridgewood);
    }

    public int numberOfDays(String checkInDate, String checkOutDate){
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate checkIn = LocalDate.parse(checkInDate, dateFormatter);
        LocalDate checkOut = LocalDate.parse(checkOutDate, dateFormatter);
        return (checkOut.getDayOfYear() - checkIn.getDayOfYear()) +1;
    }

    public String findCheapestHotel(String checkIn, String checkOut) {
        int numberOfDays = numberOfDays(checkIn, checkOut);
        Hotel cheapestHotel = listOfHotels.values().stream()
                .min(Comparator.comparingInt(Hotel::getPrice))
                .orElseThrow();
        int cheapestHotelPrice = cheapestHotel.getPrice();
        String cheapestHotelName = cheapestHotel.getHotelName();
        int totalPrice = cheapestHotelPrice * numberOfDays;
        switch (cheapestHotelName) {
            case "Lakewood":
                return "Lakewood, Total Price = $" + totalPrice;
            case "Bridgewood":
                return "Bridgewood, Total Price = $" + totalPrice;
            case "Ridgewood":
                return "Ridgewood, Total Price = $" + totalPrice;
        }
        return "more than one cheap hotels";
    }
    public void print(){
        listOfHotels.forEach((key, value) -> System.out.println(value));
    }
}
