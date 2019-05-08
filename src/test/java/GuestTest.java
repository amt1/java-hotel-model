import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest;

    @Before
    public void before(){
        guest = new Guest("Alasdair", 29);

    }

    @Test
    public void hasName() {
        assertEquals("Alasdair", guest.getName());
    }
    @Test
    public void hasAge() {
        assertEquals(29, guest.getAge());
    }

    @Test
    public void hasRoomNumber() {
        assertEquals(0, guest.getRoomNumber());
    }

    @Test
    public void canAssignRoomNumber() {
        guest.setRoomNumber(237);
        assertEquals(237, guest.getRoomNumber());
    }
}
