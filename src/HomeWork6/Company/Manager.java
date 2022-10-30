package HomeWork6.Company;

public class Manager extends Employee {
    private final String jobTitle = "Manager";
    private final int costOneOrders = 1000;
    private final int percentageOfOrders = 2; // процент от выполненых заказов
    private final int salary = 400;

    public Manager(String name) {
        super(name);
    }
    public int percentOneOrders () {
        return costOneOrders / 100 * percentageOfOrders;
    }
    @Override
    public void wages() {
        int wages = salary * (getHoursPerMonth() / getClockRate())
                + getAmountOfCompletedOrders() * percentOneOrders();
        System.out.println("З/п " + jobTitle + ": " + wages);
    }
}
