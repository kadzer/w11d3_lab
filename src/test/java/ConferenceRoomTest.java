import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {
    ConferenceRoom conferenceRoom;
    Guest guest;

    @Before
    public void setUp() {
        conferenceRoom = new ConferenceRoom(2, "Big Lebowski", 250.00, false);
        guest = new Guest("James Bond");
    }

    @Test
    public void returnsCapacity() {
        assertEquals(2, conferenceRoom.getCapacity());
    }

    @Test
    public void returnsName() {
        assertEquals("Big Lebowski", conferenceRoom.getName());
    }

    @Test
    public void returnsDailyRate() {
        assertEquals(250.00, conferenceRoom.getDailyRate(), 0.1);
    }

    @Test
    public void canCountGuests() {
        assertEquals(0, conferenceRoom.countGuests());
    }

    @Test
    public void canAddGuest() {
        conferenceRoom.addGuest(guest);
        assertEquals(1, conferenceRoom.countGuests());
    }

    @Test
    public void canGetWhetherFull() {
        assertEquals(false, conferenceRoom.isFull());
    }

    @Test
    public void isFull() {
        conferenceRoom.addGuest(guest);
        conferenceRoom.addGuest(guest);
        assertEquals(true, conferenceRoom.isFull());
    }
}
