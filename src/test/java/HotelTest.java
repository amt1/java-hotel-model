import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Bedroom room1;
    Bedroom room2;
    Bedroom room3;
    Bedroom room4;
    Bedroom room5;
    Guest guest1;
    Guest guest2;

    @Before
    public void before(){
        hotel = new Hotel("Hotel California");
        room1 = new Bedroom(1, "single", 1);
        room2 = new Bedroom(2, "twin", 2);
        room3 = new Bedroom(3, "double", 2);
        room4 = new Bedroom(4, "family", 4);
        room5 = new Bedroom(5, "small family", 3);
        guest1 = new Guest("Annabel", 703);
        guest2 = new Guest("Smithy", 49);


    }

    @Test
    public void hasName(){
        assertEquals("Hotel California", hotel.getName());
    }

    @Test
    public void startsWith5Rooms(){
        assertEquals(5, hotel.getNumberOfRooms());
    }


    @Test
    public void checkInGuestToRoom(){
    hotel.checkInGuest(guest1, room1);
    assertEquals(1, guest1.getRoomNumber());
    assertEquals(1, room1.getNumberOfGuests());

    }

    @Test
    public void checkInGuestToRoomFails(){
        hotel.checkInGuest(guest1, room1);
        hotel.checkInGuest(guest2, room1);
        assertEquals(1, guest1.getRoomNumber());
        assertEquals(1, room1.getNumberOfGuests());
    }

    @Test
    public void checkOutFromRoom(){
        hotel.checkInGuest(guest1, room1);
        hotel.checkOutGuest(guest1);
        assertEquals(0, room1.getNumberOfGuests());
    }

}
