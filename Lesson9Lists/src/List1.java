import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.Scanner;

public class List1 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Podaj kolejny element");
            String input = sc.nextLine();
            if (!input.equals("stop")) {
                names.add(input);
            }
        }
        while ();

    }
}
