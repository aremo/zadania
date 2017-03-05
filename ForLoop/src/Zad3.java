
public class Zad3 {
    public static void main(String[] args) {
        int[][] array = new int[4][4];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = i + j;
            }
        }

        for (int[] row : array) {
            for (int cell : row) {
                System.out.print(cell + " "); //print row
            }
            System.out.println(); //new line / next row
        }
    }
}

