import java.util.Calendar;

/**
 * Created by j3n5en on 2018-06-24 18:55.
 */
class DateTime_1 {
    public static void main(String[] args) {
        int year = 2018;
        int month = 5;
        int date = 24;
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        System.out.println();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month);
        calendar.set(Calendar.DATE, date);
        System.out.println(calendar.getTime());
    }
}
