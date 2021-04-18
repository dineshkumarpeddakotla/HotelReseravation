package com.hotelreservation;

public class Hotel {
    private String hotelName;
    private int weekdayPrice;
    private int weekendPrice;
    public int totalPrice;
    private int rating;


    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getWeekdayPrice() {
        return weekdayPrice;
    }

    public void setWeekdayPrice(int weekdayPrice) {
        this.weekdayPrice = weekdayPrice;
    }

    public int getWeekendPrice() {
        return weekendPrice;
    }

    public void setWeekendPrice(int weekendPrice) {
        this.weekendPrice = weekendPrice;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Hotel(String hotelName, int weekdayPrice, int weekendPrice, int rating) {
        setHotelName(hotelName);
        setWeekdayPrice(weekdayPrice);
        setWeekendPrice(weekendPrice);
        setRating(rating);
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelName='" + hotelName + '\'' +
                ", totalPrice=" + totalPrice +
                ", rating=" + rating +
                '}';
    }
}
