import java.util.Calendar;

/**
 * Created by j3n5en on 2018-06-24 19:35.
 */
class DateTime_4 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        System.out.println("min year: " + calendar.getActualMinimum(Calendar.YEAR));
        System.out.println("min month: " + calendar.getActualMinimum(Calendar.MONTH));
        System.out.println("min week: " + calendar.getActualMinimum(Calendar.WEEK_OF_YEAR));
        System.out.println("min date: " + calendar.getActualMinimum(Calendar.DATE));
    }
}
