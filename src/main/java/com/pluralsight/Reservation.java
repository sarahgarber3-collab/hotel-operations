package com.pluralsight;

public class Reservation {
    private String roomType;
    private boolean price, weekend;
    private int numberOfNights;

    public Reservation(String roomType, boolean price, boolean weekend, int numberOfNights) {
        this.roomType = roomType;
        this.price = price;
        this.weekend = weekend;
        this.numberOfNights = numberOfNights;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }
    public boolean getPrice() {
        return price;
    }

    public boolean isWeekend() {
        return weekend;
    }

    public void setIsWeekend(boolean weekend) {
        this.weekend = weekend;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }
}
