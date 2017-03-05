
public class StringEqual {
    public static void main(String[] args) {
        String name1 = "Ania";
        String name2 = "Ania";

        System.out.println(name1 == name2);

        String name3 = new String("Kasia");
        String name4 = new String("Kasia");
        System.out.println(name3 == name4);

        boolean equals = name3.equals(name4);//sprawdza czy Stringi są takie same
        System.out.println(equals);
    }
}
