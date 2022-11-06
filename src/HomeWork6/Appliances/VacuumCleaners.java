package HomeWork6.Appliances;

public class VacuumCleaners extends HomeAppliances {
    private int dustContainerVolume;
    private int noiseLevelDb;

    public VacuumCleaners(String name) {
        super(name);
    }
    public String getDesign() {
        return "Vacuum Cleaners";
    }

    public int getDustContainerVolume() {
        return dustContainerVolume;
    }

    public void setDustContainerVolume(int dustContainerVolume) {
        this.dustContainerVolume = dustContainerVolume;
    }

    public int getNoiseLevelDb() {
        return noiseLevelDb;
    }

    public void setNoiseLevelDb(int noiseLevelDb) {
        this.noiseLevelDb = noiseLevelDb;
    }
}
