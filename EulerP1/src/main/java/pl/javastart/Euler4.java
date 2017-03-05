package pl.javastart;

import java.util.ArrayList;
import java.util.List;

public class Euler4 {

    protected boolean isPalindrome(int number) {

        List<Integer> list = new ArrayList<Integer>();

        while (number > 0) {
            int i = number % 10;
            list.add(i);
            number = number / 10;
        }

        // [ 1, 0, 0, 1]
        // [ 0, 1, 2, 3]

        // i = 0
        // index_start -> 0
        // index_end -> 3 dla list.size() = 4

        // i = 1
        // index_start -> 1
        // index_end -> 2 dla list.size() = 4
        // index_end = list.size() - 1 - i

        for (int i = 0; i < list.size() / 2; i++) {
            int start = list.get(i);
            int indexEnd = list.size() - 1 - i;
            int end = list.get(indexEnd);

            if (start != end) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        long start = System.nanoTime();
        Euler4 euler4 = new Euler4();
        euler4.count();
        long end = System.nanoTime();
        System.out.println("Time: " + (end - start) + " ns");
    }

    private void count() {

        int max = 0;

        for (int i = 999; i >= 100; i--) {
            for (int j = 999; j >= 100; j--) {

                int result = i * j;
                if (isPalindrome(result)) {
                    System.out.println(i + " * " + j+ " = " + result);
                    if(result > max) {
                        max = result;
                    }
                }

            }
        }

        System.out.println("max: " + max);

    }

}