import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    Hotel hotel;
    DiningRoom diningRoom;
    Bedroom bedroom;
    ConferenceRoom conferenceRoom;
    Guest guest1;
    Guest guest2;

    @Before
    public void setUp() {
        hotel = new Hotel("Grand Budapest Hotel", diningRoom);
        diningRoom = new DiningRoom(20);
        bedroom = new Bedroom(2, 101, "Double", 70.00);
        conferenceRoom = new ConferenceRoom(2, "Spies Like Us", 250.00, false);
        guest1 = new Guest("James Bond");
        guest2 = new Guest("James Dean");
        hotel.addBedroom(bedroom);
    }

    @Test
    public void returnsName() {
        assertEquals("Grand Budapest Hotel", hotel.getName());
    }

    @Test
    public void canCountBedrooms() {
        assertEquals(1, hotel.countBedrooms());
    }

    @Test
    public void canAddBedrooms() {
        hotel.addBedroom(bedroom);
        assertEquals(2, hotel.countBedrooms());
    }

    @Test
    public void canCountConferenceRooms() {
        assertEquals(0, hotel.countConferenceRooms());
    }

    @Test
    public void canAddConferenceRoom() {
        hotel.addConferenceRoom(conferenceRoom);
        assertEquals(1, hotel.countConferenceRooms());
    }

    @Test
    public void canCheckInGuestsToBedroom() {
        hotel.checkIntoBedroom(bedroom, guest1);
        assertEquals(1, bedroom.countGuests());
    }

    @Test
    public void canCheckOutGuestsFromBedroom() {
        hotel.checkIntoBedroom(bedroom, guest1);
        hotel.checkOutOfBedroom(bedroom, guest1);
        assertEquals(0, bedroom.countGuests());
    }
}
