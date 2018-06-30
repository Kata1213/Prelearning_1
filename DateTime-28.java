import java.time.LocalDateTime;

/**
 * Created by j3n5en on 2018-06-25 15:15.
 */
class DateTime_28 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now().minusHours(4).minusMinutes(5);
        System.out.println("Current: " + LocalDateTime.now());
        System.out.println("Before 4 hours and 5 minutes: " + dateTime);
    }
}
