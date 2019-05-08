import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
    Guest guest1;

    @Before
    public void before(){
        bedroom = new Bedroom(237, "Double", 2);
        guest1 = new Guest("Alasdair", 29);

    }

    @Test
    public void hasRoomNumber() {
        assertEquals(237, bedroom.getRoomNumber());
    }
    @Test
    public void hasRoomType() {
        assertEquals("Double", bedroom.getType());
    }
    @Test
    public void hasRoomCapacity() {
        assertEquals(2, bedroom.getCapacity());
    }
    @Test
    public void hasNumberOfGuests() {
        assertEquals(0, bedroom.getNumberOfGuests());
    }
    @Test
    public void hasTab() {
        assertEquals(0, bedroom.getTab());
    }

    @Test
    public void roomCanAddGuest() {
        bedroom.addGuestToRoom(guest1);
        assertEquals(guest1, bedroom.getGuests().get(0));
    }
    @Test
    public void hasGuestAdded() {
        bedroom.addGuestToRoom(guest1);
        assertEquals(1, bedroom.getNumberOfGuests());
    }

    @Test
    public void roomCanBeFull() {
        bedroom.addGuestToRoom(guest1);
        bedroom.addGuestToRoom(guest1);
        bedroom.addGuestToRoom(guest1);
        assertEquals(2, bedroom.getNumberOfGuests());

    }

    @Test
    public void roomCanEmpty() {
        bedroom.addGuestToRoom(guest1);
        bedroom.addGuestToRoom(guest1);
        bedroom.clearRoom();
        assertEquals(0, bedroom.getNumberOfGuests());

    }
}
