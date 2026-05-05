package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean isOccupied, isDirty;

    public Room(int numberOfBeds, double price, boolean isOccupied, boolean isDirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public boolean isAvailable() {
        if (isDirty == false && isOccupied == false) {
            return true;
        } else {
            return false;
        }
    }
    public void checkIn() {
        this.isOccupied = true;
        this.isDirty = true;
    }
    public void checkOut() {
        this.isOccupied = false;
    }
    public void cleanRoom() {
        this.isDirty = false;
    }
}

