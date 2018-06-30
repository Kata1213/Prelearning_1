import java.util.Calendar;

/**
 * Created by j3n5en on 2018-06-25 13:51.
 */
class DateTime_17 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println("Current date: " + calendar.getTime());
        calendar.add(Calendar.YEAR, -1);
        System.out.println("Date before 1 year: " + calendar.getTime());
        calendar.add(Calendar.YEAR, 2);
        System.out.println("Date after 1 year: " + calendar.getTime());
    }
}
