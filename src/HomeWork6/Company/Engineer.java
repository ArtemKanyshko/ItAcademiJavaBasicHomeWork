package HomeWork6.Company;

public class Engineer extends Employee {
    private final String jobTitle = "Engineer";
    private final int costOneOrders = 1000; // стоимость одного заказа
    private final int percentageOfOrders = 10; // процент от выполненых заказов

    public Engineer(String name) {
        super(name);
    }
    public int percentOneOrders () {
        return costOneOrders / 100 * percentageOfOrders;
    }

    @Override
    public void wages() {
        int wages = getAmountOfCompletedOrders() * percentOneOrders();
        System.out.println("З/п " + jobTitle + ": " + wages);
    }

}
