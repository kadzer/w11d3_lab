import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {
    DiningRoom diningRoom;
    Guest guest;

    @Before
    public void setUp() {
        diningRoom = new DiningRoom(2);
        guest = new Guest("James Dean");
    }

    @Test
    public void returnsCapacity() {
        assertEquals(2, diningRoom.getCapacity());
    }

    @Test
    public void canCountGuests() {
        assertEquals(0, diningRoom.countGuests());
    }

    @Test
    public void canAddGuest() {
        diningRoom.addGuest(guest);
        assertEquals(1, diningRoom.countGuests());
    }

    @Test
    public void isFull() {
        diningRoom.addGuest(guest);
        diningRoom.addGuest(guest);
        assertEquals(true, diningRoom.isFull());
    }
    @Test
    public void isNotFull() {
        diningRoom.addGuest(guest);
        assertEquals(false, diningRoom.isFull());
    }

    @Test
    public void cannotAddGuestIfFull() {
        diningRoom.addGuest(guest);
        diningRoom.addGuest(guest);
        diningRoom.addGuest(guest);
        assertEquals(2, diningRoom.countGuests());
    }

    @Test
    public void canRemoveGuest() {
        diningRoom.addGuest(guest);
        diningRoom.removeGuest(guest);
        assertEquals(0, diningRoom.countGuests());
    }
}
