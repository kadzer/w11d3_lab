import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    Bedroom bedroom;

    @Before
    public void setUp() {
        bedroom = new Bedroom(2,101,"Double",70.00);
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
}
