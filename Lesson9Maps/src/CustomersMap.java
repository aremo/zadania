import java.util.*;

public class CustomersMap {
    public static void main(String[] args) {
        LinkedHashMap<Integer, Customer> customer = new LinkedHashMap<>();

        Customer customer0 = new Customer(333, "Ania", "Anielita", 555666000);
        Customer customer1 = new Customer(222, "Karol", "Sztras", 333444777);
        Customer customer2 = new Customer(111, "Jan", "Kowalski", 888999000);

        customer.put(333, customer0);
        customer.put(222, customer1);
        customer.put(111, customer2);

        Set<Integer> keySet = customer.keySet();
        System.out.println(keySet);

        Collection<Customer> values = customer.values();
        for (Customer val : values) {
            System.out.println(val);
        }

        Iterator<Customer> iterator = values.iterator();
        while (iterator.hasNext()) {
            Customer next = iterator.next();
            System.out.println(next);
        }


//        Set<Map.Entry<Integer, Customer>> entrySet = customer.entrySet();
//
//        for (Map.Entry<Integer, Customer> e : entrySet) {
//            System.out.println(e.getValue().toString());
//        }

    }
}
