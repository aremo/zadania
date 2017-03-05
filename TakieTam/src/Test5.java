/**
 * Created by aremo on 2/6/2017.
 */
public class Test5 {
    public static void main(String[] args) {
        int n = 7;
        int i = 0;
        int sum = 0;

        while (i < n) {
            System.out.print(i+"+");
            sum += i;
            i++;
        }

        System.out.println(n+"="+(sum+n));
    }
}

