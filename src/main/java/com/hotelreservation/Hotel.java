package com.hotelreservation;

public class Hotel {
    private String hotelName;
    private int weekdayPrice;
    private int weekendPrice;

    public Hotel(String hotelName, int weekdayPrice, int weekendPrice){
        setHotelName(hotelName);
        setWeekdayPrice(weekdayPrice);
        setWeekendPrice(weekendPrice);
    }
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

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelName='" + hotelName + '\'' +
                ", weekdayPrice=" + weekdayPrice +
                ", weekendPrice=" + weekendPrice +
                '}';
    }
}
