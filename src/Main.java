import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Guest guest1 = new Guest("Adéla","Malíková", LocalDate.of(1993,3,13));
        Guest guest2 = new Guest("Jan","Dvořáček", LocalDate.of(1995,5,5));

        System.out.println(guest1.getGuestString());
        System.out.println(guest2.getGuestString());

        Room room1 = new Room(1,1,true, true, 1000);
        Room room2 = new Room(2,1,true, true, 1000);
        Room room3 = new Room(3,3,false, true, 2400);

        ListOfBookings reservationBook = new ListOfBookings();
        Booking booking1 = new Booking(room1, LocalDate.of(2021,7,19),
                LocalDate.of(2021,7,26), guest1, BookingType.WORK);
        Booking booking2 = new Booking(room3, LocalDate.of(2021,9,1),
                LocalDate.of(2021,9,14), guest1, BookingType.RECREATIONAL);
        Booking booking3 = new Booking(room3, guest2, BookingType.WORK);
        booking2.addOtherGuest(guest2);
        reservationBook.addBooking(booking1);
        reservationBook.addBooking(booking2);
        reservationBook.addBooking(booking3);
        System.out.println(reservationBook.getReservations());
    }
}