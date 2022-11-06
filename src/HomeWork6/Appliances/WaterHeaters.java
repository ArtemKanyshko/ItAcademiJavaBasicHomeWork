package HomeWork6.Appliances;

public class WaterHeaters  extends AirConditioningEquipment {
    private double waterTemperature;
    public WaterHeaters(String name) {
        super(name);
    }

    public void setWaterTemperature(double waterTemperature) {
        if (isSwitchAppliances()) {
        this.waterTemperature = waterTemperature;
            System.out.println(getName() + ": Температура воды установлена на: " + this.waterTemperature);
        }
        else {
            System.out.println(getName() + ": Appliances off");
        }
    }
    public double getWaterTemperature() {
        return waterTemperature;
    }
    public void incrementTemperature() {
        if (isSwitchAppliances()) {
            waterTemperature++;
            System.out.println(getName() + ": Температура воды установлена на: " + waterTemperature);
        }
        else {
            System.out.println(getName() + ": Appliances off");
        }
    }
    public void decrementTemperature() {
        if (isSwitchAppliances()) {
            waterTemperature--;
            System.out.println(getName() + ": Температура воды установлена на: " + waterTemperature);
        }
        else {
            System.out.println(getName() + ": Appliances off");
        }
    }
}
