package com.hotelreservation;

public class Hotel {
    private String hotelName;
    private int weekdayPrice;
    private int weekendPrice;
    public int totalPrice;
    private int rating;
    private int weekdayRewardCustomerPrice;
    private int weekendCostRewardCustomerPrice;


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

    public int getWeekdayRewardCustomerPrice() {
        return weekdayRewardCustomerPrice;
    }

    public void setWeekdayRewardCustomerPrice(int weekdayRewardCustomerPrice) {
        this.weekdayRewardCustomerPrice = weekdayRewardCustomerPrice;
    }

    public int getWeekendRewardCustomerPrice() {
        return weekendCostRewardCustomerPrice;
    }

    public void setWeekendCostRewardCustomerPrice(int weekendCostRewardCustomerPrice) {
        this.weekendCostRewardCustomerPrice = weekendCostRewardCustomerPrice;
    }

    public Hotel(String hotelName, int weekdayPrice, int weekendPrice, int rating,
                 int weekdayRewardCustomerPrice, int weekendCostRewardCustomerPrice) {
        setHotelName(hotelName);
        setWeekdayPrice(weekdayPrice);
        setWeekendPrice(weekendPrice);
        setRating(rating);
        setWeekdayRewardCustomerPrice(weekdayRewardCustomerPrice);
        setWeekendCostRewardCustomerPrice(weekendCostRewardCustomerPrice);
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelName='" + hotelName + '\'' +
                ", totalPrice = $" + totalPrice +
                ", rating = " + rating +
                '}';
    }
}
