import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by j3n5en on 2018-06-25 16:41.
 */
class DateTime_36 {
    public static void main(String[] args) {
        long unix_seconds = 1529201615;
        Date date = new Date(unix_seconds * 1000L);
        SimpleDateFormat simpleDateFormat  = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC-8"));
        System.out.println(simpleDateFormat.format(date));
    }
}
