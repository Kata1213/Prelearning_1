import java.util.Calendar;
import java.util.TimeZone;

/**
 * Created by j3n5en on 2018-06-25 13:13.
 */
class DateTime_5 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("America/New_York"));
        System.out.println("Time in New York: " + calendar.get(Calendar.HOUR_OF_DAY) + ":"
                + calendar.get(Calendar.MINUTE)+":"+calendar.get(Calendar.SECOND));
    }

}
