package com.hotelreservation;

public class Hotel {
    private String hotelName;
    private int price;

    public Hotel(String hotelName, int price){
        setHotelName(hotelName);
        setPrice(price);
    }
    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "HotelName='" + hotelName + '\'' +
                ", Price = $" + price +
                '}';
    }

}
