package com.hotelreservation;

public class Hotel {
    private String hotelName;
    private int weekdayRegularCustomerPrice;
    private int weekendRegularCustomerPrice;
    public int totalPrice;
    private int rating;
    private int weekdayRewardCustomerPrice;
    private int weekendRewardCustomerPrice;


    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getWeekdayRegularCustomerPrice() {
        return weekdayRegularCustomerPrice;
    }

    public void setWeekdayRegularCustomerPrice(int weekdayRegularCustomerPrice) {
        this.weekdayRegularCustomerPrice = weekdayRegularCustomerPrice;
    }

    public int getWeekendRegularCustomerPrice() {
        return weekendRegularCustomerPrice;
    }

    public void setWeekendRegularCustomerPrice(int weekendRegularCustomerPrice) {
        this.weekendRegularCustomerPrice = weekendRegularCustomerPrice;
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
        return weekendRewardCustomerPrice;
    }

    public void setWeekendRewardCustomerPrice(int weekendRewardCustomerPrice) {
        this.weekendRewardCustomerPrice = weekendRewardCustomerPrice;
    }

    public Hotel(String hotelName, int weekdayRegularCustomerPrice, int weekendRegularCustomerPrice, int rating,
                 int weekdayRewardCustomerPrice, int weekendRewardCustomerPrice) {
        setHotelName(hotelName);
        setWeekdayRegularCustomerPrice(weekdayRegularCustomerPrice);
        setWeekendRegularCustomerPrice(weekendRegularCustomerPrice);
        setRating(rating);
        setWeekdayRewardCustomerPrice(weekdayRewardCustomerPrice);
        setWeekendRewardCustomerPrice(weekendRewardCustomerPrice);
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
