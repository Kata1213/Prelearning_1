import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by j3n5en on 2018-06-25 13:15.
 */
class DateTime_6 {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd-yy HH:mm:ss.SSS");
        System.out.println("Current full date and time is : "+simpleDateFormat.format(now.getTime()) );
    }
}
