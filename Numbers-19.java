import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by j3n5en on 2018-06-27 17:54.
 */
class Numbers_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = scanner.nextInt();
        int len = (num  + "").length() + 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < (len - 1); i++) {
            sb.append('9');
        }
        BigInteger getPrime = new BigInteger(len + "");
        if ((new BigInteger(num + "")).multiply(getPrime).equals(new BigInteger(sb.toString()))) {
            System.out.println("It is a cyclic number. ");
        } else {
            System.out.println("It is not a cyclic number. ");
        }
    }


}
