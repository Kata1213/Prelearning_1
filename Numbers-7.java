import java.util.Arrays;

/**
 * Created by j3n5en on 2018-06-26 17:51.
 */
class Numbers_7 {
    public static void main(String[] args) {
        int[] lucasNum = new int[10];
        lucasNum[0] = 2;
        lucasNum[1] = 1;
        for (int i = 2; i < 10; i++) {
            lucasNum[i] = lucasNum[i - 1] + lucasNum[i - 2];
        }
        System.out.print("First ten Lucas a numbers:");
        Arrays.stream(lucasNum).forEach(n -> System.out.print(" " + n));


    }
}
