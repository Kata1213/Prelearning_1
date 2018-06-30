import java.time.LocalDate;

/**
 * Created by j3n5en on 2018-06-25 14:16.
 */
class DateTime_22 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Current Date: "+today);
        System.out.println("10 days before : "+today.plusDays(-10));
        System.out.println("10 days after : "+today.plusDays(10)+"\n");
    }
}
