import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {
    DiningRoom diningRoom;

    @Before
    public void setUp() {
        diningRoom = new DiningRoom(20);
    }

    @Test
    public void returnsCapacity() {
        assertEquals(20, diningRoom.getCapacity());
    }
}
