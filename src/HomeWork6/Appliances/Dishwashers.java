package HomeWork6.Appliances;

public class Dishwashers extends LargeEquipment {
    private int MaxLoad;
    private int waterConsumption;
    public Dishwashers(String name) {
        super(name);
    }

    public int getMaxLoad() {
        return MaxLoad;
    }

    public void setMaxLoad(int maxLoad) {
        MaxLoad = maxLoad;
    }

    public int getWaterConsumption() {
        return waterConsumption;
    }

    public void setWaterConsumption(int waterConsumption) {
        this.waterConsumption = waterConsumption;
    }
}
