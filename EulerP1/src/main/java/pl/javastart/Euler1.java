package pl.javastart;

/**
 * Created by aremo on 2/12/2017.
 */
public class Euler1 {

    public static void main(String[] args) {

        firstMethod();
        secondMethod();
        secondMethod2();
    }

    private static void firstMethod() {
        long start = System.nanoTime();
        long sum = 0;

        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }

        System.out.println(sum);
        long end = System.nanoTime();
        System.out.println("Time: " + (end - start) + " ns");
    }

    private static void secondMethod() {
        long start = System.nanoTime();
        long sum = 0;

        for (int i = 1; i <= 333; i++) {
            int multipleOf3 = i * 3;
            int multipleOf5 = i * 5;
            if (multipleOf3 >= 1000)
                multipleOf3 = 0;
            if (multipleOf5 >= 1000)
                multipleOf5 = 0;
            if (multipleOf3 % 5 == 0)
                multipleOf3 = 0;

            sum += multipleOf3 + multipleOf5;

        }

        System.out.println(sum);
        long end = System.nanoTime();
        System.out.println("Time: " + (end - start) + " ns");
    }

    private static void secondMethod2() {
        long start = System.nanoTime();
        long sum = 0;

        for (int i = 1; i <= 333; i++) {
            int multipleOf3 = i * 3;

            int multipleOf5 = 0;
            if (i <= 200) {
                multipleOf5 = i * 5;
            }

            if (multipleOf3 >= 1000)
                multipleOf3 = 0;
            if (multipleOf5 >= 1000)
                multipleOf5 = 0;
            if (multipleOf3 % 5 == 0)
                multipleOf3 = 0;

            sum += multipleOf3 + multipleOf5;

        }

        System.out.println(sum);
        long end = System.nanoTime();
        System.out.println("Time: " + (end - start) + " ns");
    }

}
