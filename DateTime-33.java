import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

/**
 * Created by j3n5en on 2018-06-25 15:51.
 */
class DateTime_33 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println("Next Friday: " + now.with(TemporalAdjusters.next(DayOfWeek.FRIDAY)));
        System.out.println("Previous Friday: "+now.with(TemporalAdjusters.previous(DayOfWeek.FRIDAY)));
    }
}
