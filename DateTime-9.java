import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by j3n5en on 2018-06-25 13:30.
 */
class DateTime_9 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        DateFormat dateFormat = new SimpleDateFormat("EEE dd/MM/yyyy");
        calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONTH);
        System.out.println(dateFormat.format(calendar.getTime()));
        calendar.add(Calendar.DAY_OF_WEEK, 6);
        System.out.println(dateFormat.format(calendar.getTime()));
    }
}
