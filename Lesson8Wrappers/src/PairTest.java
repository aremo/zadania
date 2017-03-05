
public class PairTest {
    public static void main(String[] args) {
        Pair pair = new Pair("Jan", "Kowalski");
        Pair<Integer, Integer> nums1 = new Pair <> (5, 10); //Integer.valueOf(5)
        Pair<Double, Double> nums2 = new Pair <> (2.5, 8.8);
        Pair<String, Double> pair1 = new Pair <> ("Diablo", 2.0);

        int first1 = nums1.getFirst(); // (int) = (int)(Integer)
        double first2 = nums2.getFirst();

        String first3 = pair1.getFirst();
        double second1 = pair1.getSecond();

        double sum = first1 + first2;
        System.out.println(sum);

        String sum1 = first3+ first2;
        System.out.println(sum1);
    }
}
