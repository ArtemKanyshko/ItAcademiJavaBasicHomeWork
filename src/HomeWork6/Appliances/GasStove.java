package HomeWork6.Appliances;

public class GasStove extends LargeEquipment {
    private int mountBurner;
    private boolean oven;
    public GasStove(String name) {
        super(name);
    }
    public int getMountBurner() {
        return mountBurner;
    }

    public void setMountBurner(int mountBurner) {
        this.mountBurner = mountBurner;
    }

    public boolean isOven() {
        return oven;
    }

    public void setOven(boolean oven) {
        this.oven = oven;
    }
}
