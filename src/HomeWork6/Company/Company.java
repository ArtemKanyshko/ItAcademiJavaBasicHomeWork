package HomeWork6.Company;


abstract public class Company implements AmountPayable{
    private String name; //имя
    private int hoursPerMonth; // часы за месяц
    private final int clockRate = 160; // норма часов за месяц

    public Company(String name) {
        this.name = name;
    }

    public int getClockRate() {
        return clockRate;
    }

    public int getHoursPerMonth() {
        return hoursPerMonth;
    }

    public void setHoursPerMonth(int hoursPerMonth) {
        this.hoursPerMonth = hoursPerMonth;
    }
}
