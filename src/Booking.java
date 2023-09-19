import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Booking {

    private Room room;
    private LocalDate startDate;
    private LocalDate endDate;

    private Guest guest;

    private List<Guest> otherGuests;

    private BookingType type;

    public Booking(Room room, LocalDate startDate, LocalDate endDate, Guest guest, BookingType type) {
        this.room = room;
        this.startDate = startDate;
        this.endDate = endDate;
        this.guest = guest;
        this.type = type;

        this.otherGuests = new ArrayList<>();
    }

    public Booking(Room room, Guest guest, BookingType type)
    {
        this(room, LocalDate.now(), LocalDate.now().plusDays(6), guest, type);
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public BookingType getType() {
        return type;
    }

    public void setType(BookingType type) {
        this.type = type;
    }

    public List<Guest> getOtherGuests() {
        return otherGuests;
    }

    public void setOtherGuests(List<Guest> guests) {
        this.otherGuests = guests;
    }

    public void addOtherGuest(Guest guest) {
        otherGuests.add(guest);
    }

    public void removeOtherGuest(Guest guest) {
        otherGuests.remove(guest);
    }

    public String getBookingString()
    {
        String guestListString = guest.getGuestString() + ", " +
                otherGuests.stream().map(Guest::getGuestString).collect(Collectors.joining(", "));
        return "Mistnost " + room.getRoomNumber() + " je zarezervovana od " + ListOfBookings.FORMATTER.format(startDate)
                + " do " + ListOfBookings.FORMATTER.format(endDate) + " pro hosty " + guestListString;
    }
}
