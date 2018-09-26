import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    Hotel hotel;
    DiningRoom diningRoom;

    @Before
    public void setUp() {
        hotel = new Hotel("Grand Budapest Hotel", diningRoom);
        diningRoom = new DiningRoom(20);
    }

    @Test
    public void returnsName() {
        assertEquals("Grand Budapest Hotel", hotel.getName());
    }

//    @Test
//    public void canCheckInGuests() {
//        assertEquals();
//    }
}
