import java.time.Duration;
import java.time.LocalDateTime;

/**
 * Created by j3n5en on 2018-06-25 15:33.
 */
class DateTime_31 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.of(2008, 8, 8,8,8);
        LocalDateTime now = LocalDateTime.now();
        Duration duration = Duration.between(dateTime, now);
        System.out.printf("%d Hours, %d Minutes, %d Seconds, %d Millis, %d Nanos",
                duration.toHours(),
                duration.toMinutes(),
                duration.getSeconds(),
                duration.toMillis(),
                duration.getNano()
                );
    }
}
