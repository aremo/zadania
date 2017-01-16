package zad2;

public class Pisowiec {
    private String firstName;
    private String lastName;
    private double iq;

    public Pisowiec(String firstName, String lastName, double iq) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.iq = iq;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getIq() {
        return iq;
    }

    public void setIq(double iq) {
        this.iq = iq;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;  // sprawdza czy obiekt ma wartosc LUB jest tej samej klasy
        if (o == null || getClass() != o.getClass()) return false;
        if (o == null || getClass() != o.getClass()) return false;

        Pisowiec pisowiec = (Pisowiec) o;

        if (Double.compare(pisowiec.iq, iq) != 0) return false;
        if (firstName != null ? !firstName.equals(pisowiec.firstName) : pisowiec.firstName != null) return false;
        return lastName != null ? lastName.equals(pisowiec.lastName) : pisowiec.lastName == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        temp = Double.doubleToLongBits(iq);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Pisowiec{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", iq=" + iq +
                '}';
    }
}
