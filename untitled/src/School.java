
public class School {
    public static void main(String[] args) {
        Teacher nauczyciel = new Teacher("Edzio", "Listonosz", 2500);
        Student uczen = new Student("Włodek", "Menel", 3.0);

        uczen.show();
        nauczyciel.show();
    }
}
