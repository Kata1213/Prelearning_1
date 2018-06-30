import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;

/**
 * Created by j3n5en on 2018-06-25 15:40.
 */
class DateTime_32 {
    public static void main(String[] args) {
        LocalDate birth = LocalDate.of(1996, 4, 10);
        LocalDate now = LocalDate.now();
        Period period = Period.between(birth, now);
        System.out.printf(
                "I'm %d years, %d months, %d days old",
                period.getYears(), period.getMonths(), period.getDays()
        );
    }
}
