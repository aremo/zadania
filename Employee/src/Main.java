public class Main {
    public static void main(String[] args) {
        Employee meEmployee1 = new Employee();
        System.out.println(meEmployee1.getFirstName() + " " + meEmployee1.getLastName() + " " + meEmployee1.getSalary());

        Employee meEmployee2 = new Employee("Arian", "Kompani Zare");
        System.out.println(meEmployee2.getFirstName() + " " + meEmployee2.getLastName() + " " + meEmployee2.getSalary());

        Employee meEmployee3 = new Employee("Arian", "Kompani Zare", 9999);
        System.out.println(meEmployee3.getFirstName() + " " + meEmployee3.getLastName() + " " + meEmployee3.getSalary());
    }
}
