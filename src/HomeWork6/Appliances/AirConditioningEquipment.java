package HomeWork6.Appliances;

abstract class AirConditioningEquipment extends Appliances implements TemperatureVariable { // климатическая техника
    private boolean wallAppliances; // настенная или нет

    public AirConditioningEquipment(String name) {
        super(name);
    }

    public boolean isWallAppliances() {
        return wallAppliances;
    }

    public void setWallAppliances(boolean wallAppliances) {
        this.wallAppliances = wallAppliances;
    }
}
