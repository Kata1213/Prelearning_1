import java.util.Scanner;

/**
 * Created by j3n5en on 2018-06-27 17:52.
 */
class Numbers_18 {
    public static void main( String args[] ){
        Scanner sc = new Scanner( System.in );
        System.out.print("Input a number: ");
        int num = sc.nextInt();
        int n = (int) Math.round(Math.pow(num, 1.0/3.0));
        System.out.println("Number is "+(num == n * n * n?"":"not")+" a cube.");
    }
}
