package zad2;

public class PisowiecTest {
    public static void main(String[] args) {
        Pisowiec[] pisowcy = new Pisowiec[3];
        pisowcy[0] = new Pisowiec("Jarosław", "Kaczynski", 55);
        pisowcy[1] = new Pisowiec("Jarosław", "Kaczynski", 55);
        pisowcy[2] = new Pisowiec("Jarosław", "Kaczynski", 55);

        for (int i = 0; i < pisowcy.length; i++) {
            System.out.println("pisowiec numer " + i + " jest taki: " + pisowcy[i]);
            for (int j = 0; j < pisowcy.length; j++) {
                if (i != j && i < j) {
                    System.out.println("porownujemy obiekt: "
                            + i + " z obiektem: "
                            + j + " porownianie jest: "
                            + pisowcy[i].equals(pisowcy[j]));
                }
            }
        }

    }
}

