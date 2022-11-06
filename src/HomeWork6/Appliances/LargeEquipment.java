package HomeWork6.Appliances;

abstract class LargeEquipment extends Appliances {
    private boolean embedded; // встраиваемая или нет
    public LargeEquipment(String name) {
        super(name);
    }
}
