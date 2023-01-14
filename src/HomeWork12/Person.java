package HomeWork12;

public class Person {
    private final String firstname;
    private final String lastName;
    private final int birthday;

    public Person(String firstname, String lastName, int birthday) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.birthday = birthday;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthday() {
        return birthday;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
