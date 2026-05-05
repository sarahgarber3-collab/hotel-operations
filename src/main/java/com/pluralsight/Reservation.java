package com.pluralsight;

public class Reservation {
    private String roomType;
    private boolean weekend;
    private int numberOfNights;

    public Reservation(String roomType, boolean price, boolean weekend, int numberOfNights) {
        this.roomType = roomType;
        this.weekend = weekend;
        this.numberOfNights = numberOfNights;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        if (roomType.equalsIgnoreCase("king")) {
            return 139.00;
        } else {
            return 124.00;
        }
    }

    public double getReservationTotal() {
        double pricePerNight = getPrice();
        if (weekend) {
            pricePerNight = pricePerNight * 1.10;
        }
        return pricePerNight * numberOfNights;
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
