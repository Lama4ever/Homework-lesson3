import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfBookings {

    public static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("d.M.YYYY");

    private List<Booking> bookingList;

    public ListOfBookings() {
        this.bookingList = new ArrayList<>();
    }

    public List<Booking> getBookingList() {
        return bookingList;
    }

    public void setBookingList(List<Booking> bookingList) {
        this.bookingList = bookingList;
    }

    public void addBooking(Booking newBooking)
    {
        bookingList.add(newBooking);
    }

    public void removeBooking(Booking canceledBooking)
    {
        bookingList.remove(canceledBooking);
    }

    public String getReservations()
    {
        String reservationsString = bookingList.stream().map(Booking::getBookingString)
                .collect(Collectors.joining("\n"));
        return reservationsString;
    }
}
