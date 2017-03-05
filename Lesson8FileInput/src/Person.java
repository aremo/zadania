import java.io.Serializable;

public class Person implements Serializable {
    private String firstName;
    private String lastName;
    private int age;
    private int pesel;

    public Person(String firsName, String lastName, int age, int pesel) {
        this.firstName = firsName;
        this.lastName = lastName;
        this.age = age;
        this.pesel = pesel;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firsName) {
        this.firstName = firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPesel() {
        return pesel;
    }

    public void setPesel(int pesel) {
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + age + " " + pesel;
    }
}
