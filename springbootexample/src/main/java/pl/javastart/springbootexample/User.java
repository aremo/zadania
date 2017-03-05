package pl.javastart.springbootexample;


public class User {
    private String name;
    private String lastName;
    private int age;

    public User(String firstName, String lastName, int age) {
        this.name = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return name;
    }

    public void setFirstName(String firstName) {
        this.name = firstName;
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
}
