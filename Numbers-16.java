import java.util.Scanner;

/**
 * Created by j3n5en on 2018-06-27 17:44.
 */
class Numbers_16 {
    private static int getSumOfProperDivisors(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int firstNum = scanner.nextInt();

        System.out.print("Input the second number: ");
        int secondNum = scanner.nextInt();

        System.out.println("These numbers are " + (getSumOfProperDivisors(firstNum) == getSumOfProperDivisors(secondNum) ? "" : "not ") + "amicable.");
    }
}
