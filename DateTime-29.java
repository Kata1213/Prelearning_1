import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

/**
 * Created by j3n5en on 2018-06-25 15:17.
 */
class DateTime_29 {
    public static void main(String[] args) {
        String string = "六月 25, 2018";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM d, yyyy", Locale.CHINESE);
        LocalDate date = LocalDate.parse(string, formatter);
        System.out.println(date);
    }
}
