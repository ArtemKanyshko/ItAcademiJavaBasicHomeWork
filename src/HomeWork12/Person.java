package HomeWork12;

public class Person {
    private final String Firstname;
    private final String LastName;
    private final int birthday;

    public Person(String firstname, String lastName, int birthday) {
        Firstname = firstname;
        LastName = lastName;
        this.birthday = birthday;
    }

    public String getFirstname() {
        return Firstname;
    }

    public String getLastName() {
        return LastName;
    }

    public int getBirthday() {
        return birthday;
    }
}
