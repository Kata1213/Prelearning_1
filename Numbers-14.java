import java.util.Scanner;

/**
 * Created by j3n5en on 2018-06-27 15:32.
 */
class Numbers_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number : ");
        int num = scanner.nextInt();
        int sq_num = num*num;
        String str_num = Integer.toString(num);
        String square = Integer.toString(sq_num);
        System.out.println((square.endsWith(str_num) ? "" : "Not an ") + "Automorphic Number.");

    }
}
