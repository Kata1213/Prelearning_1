import java.util.Scanner;

/**
 * Created by j3n5en on 2018-06-27 14:54.
 */
class Numbers_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = scanner.nextInt();
        System.out.println(Numbers_9.isHappyNum(num)?"H":"Unh"+"appy Number");
    }
}
