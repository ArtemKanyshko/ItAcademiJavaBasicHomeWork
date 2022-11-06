package HomeWork6.Company;

public class ChiefAccountant extends Administration{
    private final String jobTitle = "ChiefAccountant";
    private final int salary = 800;

    public ChiefAccountant(String name) {
        super(name);
    }

    @Override
    public void wages() {
        int wages = salary * (getHoursPerMonth() / getClockRate());
        System.out.println("З/п " + jobTitle + ": " + wages);
    }
}
