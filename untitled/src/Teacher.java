
public class Teacher extends SchoolMate {

    private int salary = 2500;

    public Teacher(String firstName, String lastName, int salary) {
        super(firstName, lastName);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("zarabia " + salary);

    }
}
