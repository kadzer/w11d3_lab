import java.util.ArrayList;

public class Hotel {
    private String name;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private DiningRoom diningRoom;

    public Hotel(String name, DiningRoom diningRoom) {
        this.name = name;
        this.bedrooms = new ArrayList<>();
        this.conferenceRooms = new ArrayList<>();
        this.diningRoom = diningRoom;
    }

    public String getName() {
        return name;
    }

    public int countBedrooms() {
        return this.bedrooms.size();
    }

    public void addBedroom(Bedroom bedroom) {
        this.bedrooms.add(bedroom);
    }

    public int countConferenceRooms() {
        return this.conferenceRooms.size();
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom) {
        this.conferenceRooms.add(conferenceRoom);
    }

    public void checkIntoBedroom(Bedroom bedroom, Guest guest) {
        bedroom.addGuests(guest);
    }

    public void checkOutOfBedroom(Bedroom bedroom, Guest guest) {
        bedroom.checkoutGuest(guest);
    }
}

