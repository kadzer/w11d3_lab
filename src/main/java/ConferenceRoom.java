import java.util.ArrayList;

public class ConferenceRoom {
    private int capacity;
    private ArrayList<Guest> guests;
    private String name;
    private double dailyRate;
    private boolean isFull;

    public ConferenceRoom(int capacity, String name, double dailyRate, boolean isFull) {
        this.capacity = capacity;
        this.guests = new ArrayList<>();
        this.name = name;
        this.dailyRate = dailyRate;
        this.isFull = isFull;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getName() {
        return name;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public boolean isFull() {
        return isFull;
    }

    public int countGuests() {
        return this.guests.size();
    }

    public void addGuest(Guest guest) {
        if (!isFull) {
            this.guests.add(guest);
            if (countGuests() == getCapacity()) {
                setFull(true);
            }
        }
    }

    public void setFull(boolean full) {
        isFull = full;
    }
}
