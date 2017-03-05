/**
 * Created by aremo on 1/10/2017.
 */
public class StaticMethod {

    private static final String APP_NAME = "Moja Aplikacja";

    public static void main(String[] args) {
        System.out.println(APP_NAME);
        int[] tab = {1, 2, 3};
        display(tab);
    }

    static void display(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
