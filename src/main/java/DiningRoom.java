import java.util.ArrayList;

public class DiningRoom {
    private int capacity;
    private ArrayList<Guest> guests;

    public DiningRoom(int capacity) {
        this.capacity = capacity;
        this.guests = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public int countGuests() {
        return this.guests.size();
    }

    public void addGuest(Guest guest) {
        if (!isFull()) {
            this.guests.add(guest);
        }
    }

    public boolean isFull() {
        return countGuests() == getCapacity();
    }

    public void removeGuest(Guest guest) {
        this.guests.remove(guest);
    }
}
