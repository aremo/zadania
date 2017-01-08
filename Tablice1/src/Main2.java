public class Main2 {
    public static void main(String[] args) {
        int[][] tablica = new int[4][];
        tablica[0] = new int[3];
        tablica[1] = new int[2];
        tablica[2] = new int[4];
        tablica[3] = new int[1];

        tablica[0][0] = 1;
        tablica[0][1] = 2;
        tablica[0][2] = 3;
        tablica[1][0] = 4;
        tablica[1][1] = 5;
        tablica[2][0] = 6;
        tablica[2][1] = 7;
        tablica[2][2] = 8;
        tablica[2][3] = 9;
        tablica[3][0] = 10;

        int sum = tablica[0][0] +
                tablica[0][1] +
                tablica[0][2] +
                tablica[1][0] +
                tablica[1][1] +
                tablica[2][0] +
                tablica[2][1] +
                tablica[2][2] +
                tablica[2][3] +
                tablica[3][0];

        System.out.println(sum);

    }
}
