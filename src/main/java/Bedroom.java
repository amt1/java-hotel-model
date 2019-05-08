import java.util.ArrayList;

public class Bedroom {

    private int roomNumber;
    private int capacity;
    private ArrayList<Guest> guests = new ArrayList<>();
    private String type;
    private int tab = 0;

    public Bedroom(int roomNumber, String type, int capacity){
        this.roomNumber = roomNumber;
        this.type = type;
        this.capacity = capacity;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public int getNumberOfGuests() {
        return guests.size();
    }

    public boolean addGuestToRoom(Guest guest) {
        if (isFull()) return false;
        guests.add(guest);
        resetTab();
        return true;
    }

    public String getType() {
        return type;
    }

    public int getTab() {
        return tab;
    }

    public boolean isFull() {
        if (getNumberOfGuests() >= capacity) return true;
        return false;
    }

    public void resetTab() {
        tab = 0;
    }

    public void clearRoom() {
        guests.clear();
    }
}
