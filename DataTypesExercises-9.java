import java.util.Scanner;

/**
 * Created by j3n5en on 2018-06-24 15:06.
 */
class DataTypesExercises_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input 1st integer: ");
        int firstInt = input.nextInt();
        System.out.print("Input 2nd integer: ");
        int secondInt = input.nextInt();
        System.out.printf("Sum of two integers: %d%n", firstInt + secondInt);
        System.out.printf("Difference of two integers: %d%n", firstInt - secondInt);
        System.out.printf("Product of two integers: %d%n", firstInt * secondInt);
        System.out.printf("Average of two integers: %.2f%n", (double) (firstInt + secondInt) / 2);
        System.out.printf("Distance of two integers: %d%n", Math.abs(firstInt - secondInt));
        System.out.printf("Max integer: %d%n", Math.max(firstInt, secondInt));
        System.out.printf("Min integer: %d%n", Math.min(firstInt, secondInt));
    }
}
