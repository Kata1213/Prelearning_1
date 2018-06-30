import java.util.Calendar;

/**
 * Created by j3n5en on 2018-06-25 13:38.
 */
class DateTime_11 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println("The number of days of a month:"
                + cal.getActualMaximum(Calendar.DAY_OF_MONTH));
    }
}
