/**
 * Created by aremo on 1/29/2017.
 */
public class Test3 {
    private static final int WEEK_DAYS = 7;
    static int statValue = 0;
    static int instanceValue = 0;

    public static void main(String[] args) {
        instanceValue = 5; //błądpole niestatyczne
        statValue = 5; //ok
        System.out.println(WEEK_DAYS);
        int[] tab = {5, 10, 15};

    }
}
