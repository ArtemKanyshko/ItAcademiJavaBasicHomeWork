package HomeWork6.Company;

public class Director extends Administration {
    private final String jobTitle = "Director";
    private final int salary = 1500;

    public Director(String name) {
        super(name);
    }

    @Override
    public void wages() {
        System.out.println("З/п " + jobTitle + ": " + salary);
    }
}
