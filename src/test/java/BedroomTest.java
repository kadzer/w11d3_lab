import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    Bedroom bedroom;
    Guest guest;

    @Before
    public void setUp() {
        bedroom = new Bedroom(2,101,"Double",70.00);
        guest = new Guest("The Dude");
    }

    @Test
    public void returnsCapacity() {
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void returnsRoomNumber() {
        assertEquals(101, bedroom.getRoomNumber());
    }

    @Test
    public void returnsBedroomType() {
        assertEquals("Double", bedroom.getBedroomType());
    }

    @Test
    public void returnsNightlyRate() {
        assertEquals(70.00, bedroom.getNightlyRate(), 0.1);
    }

    @Test
    public void returnsNumberOfGuests() {
        assertEquals(0, bedroom.countGuests());
    }

    @Test
    public void canAddGuests() {
        bedroom.addGuests(guest);
        assertEquals(1, bedroom.countGuests());
    }

    @Test
    public void checkIfFull() {
        bedroom.addGuests(guest);
        assertEquals(false, bedroom.isFull());
        bedroom.addGuests(guest);
        assertEquals(true, bedroom.isFull());
    }

    @Test
    public void cannotAddGuestsIfFull() {
        bedroom.addGuests(guest);
        bedroom.addGuests(guest);
        bedroom.addGuests(guest);
        assertEquals(2, bedroom.countGuests());
    }

    @Test
    public void canRemoveGuests() {
        bedroom.addGuests(guest);
        bedroom.checkoutGuest(guest);
        assertEquals(0, bedroom.countGuests());
    }

    @Test
    public void cannotRemoveGuestsIfEmpty() {
        bedroom.checkoutGuest(guest);
        assertEquals(0, bedroom.countGuests());
    }
}
