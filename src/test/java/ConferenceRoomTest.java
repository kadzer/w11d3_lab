import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {
    ConferenceRoom conferenceRoom;

    @Before
    public void setUp() {
        conferenceRoom = new ConferenceRoom(10, "Big Lebowski", 250.00);
    }

    @Test
    public void returnsCapacity() {
        assertEquals(10, conferenceRoom.getCapacity());
    }

    @Test
    public void returnsName() {
        assertEquals("Big Lebowski", conferenceRoom.getName());
    }

    @Test
    public void returnsDailyRate() {
        assertEquals(250.00, conferenceRoom.getDailyRate(), 0.1);
    }
}
