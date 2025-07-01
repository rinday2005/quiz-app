/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;

/**
 *
 * @author ADMIN
 */
class FlightInformation {
    private String flightNumber;
    private String seatNumber;
    private String timePickUp;

    public FlightInformation(String flightNumber, String seatNumber, String timePickUp) {
        this.flightNumber = flightNumber;
        this.seatNumber = seatNumber;
        this.timePickUp = timePickUp;
    }

    @Override
    public String toString() {
        return flightNumber + " - " + seatNumber + " - " + timePickUp;
    }
}

public class Reservation {
    private String bookingID;
    private String customerName;
    private String phoneNumber;
    private String roomNumber;
    private String bookingDate;
    private FlightInformation flightInfo;

    public Reservation(String bookingID, String customerName, String phoneNumber, String roomNumber, String bookingDate, FlightInformation flightInfo) {
        this.bookingID = bookingID;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.roomNumber = roomNumber;
        this.bookingDate = bookingDate;
        this.flightInfo = flightInfo;
    }

    public String getBookingID() {
        return bookingID;
    }

    @Override
    public String toString() {
        return bookingID + " - " + customerName + " - " + phoneNumber + " - " + roomNumber + " - " + bookingDate + " - " + flightInfo;
    }
}
