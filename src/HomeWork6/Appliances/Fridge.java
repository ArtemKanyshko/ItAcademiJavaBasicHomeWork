package HomeWork6.Appliances;

public class Fridge extends LargeEquipment {
    private int amountOfColdRooms;
    private boolean freezer;

    public Fridge(String name) {
        super(name);
    }

    public int getAmountOfColdRooms() {
        return amountOfColdRooms;
    }

    public void setAmountOfColdRooms(int amountOfColdRooms) {
        this.amountOfColdRooms = amountOfColdRooms;
    }

    public boolean isFreezer() {
        return freezer;
    }

    public void setFreezer(boolean freezer) {
        this.freezer = freezer;
    }
}
