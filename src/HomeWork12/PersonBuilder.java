package HomeWork12;

public class PersonBuilder implements Builder{
    private String firstname;
    private String lastname;
    private int birthday;
    @Override
    public void setFirstName(String firstname) {
        this.firstname = firstname;
    }

    @Override
    public void setLastName(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }
    public Person getResult () {
        return new Person(firstname, lastname, birthday);
    }
}
