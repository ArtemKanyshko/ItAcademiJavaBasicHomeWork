package HomeWork6.Appliances;

public class AirConditioner extends AirConditioningEquipment {
    private double airTemperature;
    public AirConditioner(String name) {
        super(name);
    }
    public void setAirTemperature(double airTemperature) {
        if (isSwitchAppliances()) {
            this.airTemperature = airTemperature;
            System.out.println(getName() + ": Температура воздуха установлена на: " + this.airTemperature);
        }
        else {
            System.out.println(getName() + ": Appliances off");
        }
    }
    public double getAirTemperature() {
        return airTemperature;
    }

    public void incrementTemperature() {
        if (isSwitchAppliances()) {
            airTemperature++;
            System.out.println(getName() + ": Температура воздуха установлена на: " + airTemperature);
        }
        else {
            System.out.println(getName() + ": Appliances off");
        }
    }
    public void decrementTemperature() {
        if (isSwitchAppliances()) {
            airTemperature--;
            System.out.println(getName() + ": Температура воздуха установлена на: " + airTemperature);
        }
        else {
            System.out.println(getName() + ": Appliances off");
        }
    }
}
