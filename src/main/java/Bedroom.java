import java.util.ArrayList;

public class Bedroom {
    private int capacity;
    private ArrayList<Guest> guests;
    private int roomNumber;
    private String bedroomType;
    private double nightlyRate;

    public Bedroom(int capacity, int roomNumber, String bedroomType, double nightlyRate) {
        this.capacity = capacity;
        this.guests = new ArrayList<>();
        this.roomNumber = roomNumber;
        this.bedroomType = bedroomType;
        this.nightlyRate = nightlyRate;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getBedroomType() {
        return bedroomType;
    }

    public double getNightlyRate() {
        return nightlyRate;
    }

    public int countGuests() {
        return this.guests.size();
    }

    public void addGuests(Guest guest) {
        if(!isFull()){
        this.guests.add(guest);}
    }

    public boolean isFull() {
        return countGuests() == getCapacity();
    }

    public void checkoutGuest(Guest guest) {
        if (getCapacity() > 0) {
            this.guests.remove(guest);
        }
    }
}
