import java.util.Calendar;

/**
 * Created by j3n5en on 2018-06-25 13:29.
 */
class DateTime_8 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.getTime());
    }
}
