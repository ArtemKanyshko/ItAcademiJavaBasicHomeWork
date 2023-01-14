package HomeWork6.Appliances;

abstract class Appliances implements Pluggable{ // родитель для бытовой техники
    private String name;
    private boolean switchAppliances;

    public Appliances(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isSwitchAppliances() {
        return switchAppliances;
    }
    public void plugIn () { // включить
        System.out.println(name + " On");
        switchAppliances = true;
    }
    public void unplug () { // выключить
        System.out.println(name + " Off");
        switchAppliances = false;
    }

}
