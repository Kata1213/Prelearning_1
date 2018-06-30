import java.time.LocalDate;
import java.time.Period;

/**
 * Created by j3n5en on 2018-06-25 15:31.
 */
class DateTime_30 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2008, 8, 8);
        LocalDate now = LocalDate.now();
        Period diff = Period.between(date, now);
        System.out.printf("%d years, %d months, %d days",
                diff.getYears(), diff.getMonths(), diff.getDays());

    }
}
