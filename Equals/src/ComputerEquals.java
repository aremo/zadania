
public class ComputerEquals {
    public static void main(String[] args) {
        Computer comp1 = new Computer("Dell", 2500);
        Computer comp2 = new Computer("Asus", 2500);

        if(comp1 == comp2) {
            System.out.println("Komputery są takie same");
        }
        if (comp1.equals(comp2)) {
            System.out.println("Komputery są takie same equals");
        }

        int comp1Hash = comp1.hashCode();
        int comp2Hash = comp2.hashCode();
        System.out.println(comp1Hash);
        System.out.println(comp2Hash);

        System.out.println(comp1.getPrice()+comp1.getPrice());
        String opisComp1 = comp1.toString();
        System.out.println(opisComp1);
        System.out.println(comp2.toString());
        System.out.println(comp1);

    }
}

