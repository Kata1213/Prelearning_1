import java.util.Scanner;

/**
 * Created by j3n5en on 2018-06-17 11:46.
 */
class DataTypesExercises_02 {
    public static void main(String[] Strings) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a value for inch: ");
        double inch = input.nextDouble();
        double meters = inch * 0.0254;
        System.out.println(inch+" inch is "+meters+" meters");
    }
}
