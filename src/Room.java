public class Room {
    private int roomNumber;
    private int persons;

    private boolean balcony;

    private boolean seeView;

    private int pricePerNight;

    public Room(int roomNumber, int persons, boolean balcony, boolean seeView, int pricePerNight) {
        this.roomNumber = roomNumber;
        this.persons = persons;
        this.balcony = balcony;
        this.seeView = seeView;
        this.pricePerNight = pricePerNight;
    }


    public int getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(int pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public boolean isBalcony() {
        return balcony;
    }

    public void setBalcony(boolean balcony) {
        this.balcony = balcony;
    }

    public int getPersons() {
        return persons;
    }

    public void setPersons(int persons) {
        this.persons = persons;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public boolean isSeeView() {
        return seeView;
    }

    public String isSeeViewCzech() {
        if(seeView){
            return "ano";
        } else {
            return"ne";
        }
    }

    public void setSeeView(boolean seeView) {
        this.seeView = seeView;
    }
}
