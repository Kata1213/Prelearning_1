/**
 * Created by j3n5en on 2018-06-27 17:57.
 */
class Numbers_20 {
    public static void main(String[] args) {
        int n = 0;
        double result;

        while (n <= 10) {
            result= Math.pow (2, Math.pow(2, n)) + 1;
            n++;
            System.out.println (result);
        }
    }
}
