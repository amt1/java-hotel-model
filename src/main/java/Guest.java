public class Guest {

    private String name;
    private int age;
    private int roomNumber = 0;

    public Guest(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getRoomNumber() {
        return roomNumber;
    }
    public void setRoomNumber(int number) {
        roomNumber = number;
    }
}
