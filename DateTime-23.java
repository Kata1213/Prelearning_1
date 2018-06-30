import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.TemporalAdjusters;

/**
 * Created by j3n5en on 2018-06-25 14:22.
 */
class DateTime_23 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate lastDayOfYear = today.with(TemporalAdjusters.lastDayOfYear());
        Period period = today.until(lastDayOfYear);
        System.out.println("Months remaining in the year: "+period.getMonths());
    }
}
