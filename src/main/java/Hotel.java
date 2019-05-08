import java.util.ArrayList;
import java.util.Arrays;

public class Hotel {
    private ArrayList bedroomsAvailable;
    private String name;
    private ArrayList<Bedroom> bedroomsUnavailable;
    private Bedroom room1 = new Bedroom(1, "single", 1);
    private Bedroom room2 = new Bedroom(2, "twin", 2);
    private Bedroom room3 = new Bedroom(3, "double", 2);
    private Bedroom room4 = new Bedroom(4, "family", 4);
    private Bedroom room5 = new Bedroom(5, "small family", 3);


    public Hotel(String name){
        this.bedroomsAvailable = new ArrayList<>(Arrays.asList(room1, room2, room3, room4, room5));
        this.name = name;
        this.bedroomsUnavailable = new ArrayList<>();
    }

    public int getNumberOfRooms(){
        return bedroomsAvailable.size();
    }

    public String getName() {
        return name;
    }


    public void checkInGuest(Guest guest, Bedroom room) {
        if (room.addGuestToRoom(guest)) {
            guest.setRoomNumber(room.getRoomNumber());
            bedroomsUnavailable.add(room);
            bedroomsAvailable.remove(room);
        } else {
            System.out.println("Room not available");
        }
    }

    public void checkOutGuest(Guest guest) {
        int roomNumber = guest.getRoomNumber();
        int index = 0;
        int indexRecorded = 0;
        for (Bedroom room : bedroomsUnavailable) {
            if (room.getRoomNumber() == roomNumber ) {
                indexRecorded = index;
            }
            index += 1;
        }
        Bedroom room = bedroomsUnavailable.get(indexRecorded);
        bedroomsUnavailable.remove(room);
        bedroomsAvailable.add(room);
        room.clearRoom();
        int tab = room.getTab();
        room.resetTab();
    }
}
