
public class Student extends SchoolMate {

    private double markAvg = 3.0;

    public Student(String firstName, String lastName, double markAvg) {
        super(firstName, lastName);
        this.markAvg = markAvg;
    }

    public double getMarkAvg() {
        return markAvg;
    }

    public void setMarkAvg(double markAvg) {
        this.markAvg = markAvg;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("ma średnią ocen " + markAvg);

    }
}
