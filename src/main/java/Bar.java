import java.util.ArrayList;

public class Bar {

    private int capacity;
    private ArrayList<Guest> guests;
    private String name;
    private int ageRequirement = 18;
    private int drinkPrice = 10;

    public Bar(int capacity, String name){
        this.capacity = capacity;
        this.name = name;
        this.guests = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public int getPatronsNumber(){
        return guests.size();
    }

    public String getName() {
        return name;
    }

    public int getAgeRequirement() {
        return ageRequirement;
    }


    public boolean isOldEnough(Guest guest) {
        if (guest.getAge() >= ageRequirement) return true;
        return false;
    }

    public boolean hasEnoughSpace() {
        if (getPatronsNumber() < capacity) return true;
        return false;
    }

    public void addPatron(Guest guest) {
        if (hasEnoughSpace() && isOldEnough(guest)) {
            guests.add(guest);
        }
    }

    public void closeBar() {
        guests.clear();
    }

    public void removePatron(Guest guest) {
        if (isPatronInBar(guest)) {
            guests.remove(guest);
        }
    }

    public boolean isPatronInBar(Guest guest) {
        return guests.contains(guest);
    }
}
