package HomeWork6.Appliances;

abstract class HomeAppliances extends Appliances {
    private String design;
    public HomeAppliances(String name) {
        super(name);
    }

    public String getDesign() {
        return design;
    }

    public void setDesign(String design) {
        this.design = design;
    }
}
