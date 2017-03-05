package pl.javastart;

/**
 * Created by aremo on 2/12/2017.
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] myArray = {10, 5, 3, 2, 8, 6, 1, 7, 0, 4, 9};
        BubbleSortOneLoop(myArray);
    }

    private static void BubbleSortOneLoop(int[] myArray) {
        int temp;
        for (int i = 0; i < myArray.length; i++) {
            if ((i + 1) == myArray.length) {
                for (int j : myArray) {
                    System.out.print(j + " ,");
                }
                break;
            }
            if (myArray[i] > myArray[i + 1]) {
                temp = myArray[i];
                myArray[i] = myArray[i + 1];
                myArray[i + 1] = temp;
                i = -1;
            }
        }
    }
}


