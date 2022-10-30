package HomeWork6.Company;

abstract public class Employee extends Company{
    private int amountOfCompletedOrders; // количество выполненых заказов

    public Employee(String name) {
        super(name);
    }

    public int getAmountOfCompletedOrders() {
        return amountOfCompletedOrders;
    }

    public void setAmountOfCompletedOrders(int amountOfCompletedOrders) {
        this.amountOfCompletedOrders = amountOfCompletedOrders;
    }
}
