package HomeWork7;

public class Garage<V extends Vehicle> {
    V vehicle;

    public Garage(V vehicle) {
        this.vehicle = vehicle;
    }
}
