import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by j3n5en on 2018-06-25 15:55.
 */
class DateTime_34 {
    public static void main(String[] args) {
        Calendar cal = new GregorianCalendar();
        cal.set(Calendar.HOUR_OF_DAY, 10);
        cal.set(Calendar.MINUTE, 2);
        cal.set(Calendar.SECOND, 5);
        System.out.println(cal.getTime());
    }
}
