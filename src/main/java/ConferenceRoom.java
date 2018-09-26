import java.util.ArrayList;

public class ConferenceRoom {
    private int capacity;
    private ArrayList<Guest> guests;
    private String name;
    private double dailyRate;

    public ConferenceRoom(int capacity, String name, double dailyRate) {
        this.capacity = capacity;
        this.guests = new ArrayList<>();
        this.name = name;
        this.dailyRate = dailyRate;
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
}
