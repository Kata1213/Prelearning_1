import java.util.Scanner;

/**
 * Created by j3n5en on 2018-06-26 16:59.
 */
class Numbers_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the start of the range: ");
        int start = scanner.nextInt();
        System.out.print("Input the end of the range: ");
        int end = scanner.nextInt();
        int random = start + (int)(Math.random() * ((end - start) + 1));
        System.out.print("the random num is " + random);
    }
}
