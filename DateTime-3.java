import java.util.Calendar;

/**
 * Created by j3n5en on 2018-06-24 18:59.
 */
class DateTime_3 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println("Actual Maximum Year: " + calendar.getActualMaximum(Calendar.YEAR));
        System.out.println("Actual Maximum Month: " + calendar.getActualMaximum(Calendar.MONTH));
        System.out.println("Actual Maximum Week of Year: " + calendar.getActualMaximum(Calendar.WEEK_OF_YEAR));
        System.out.println("Actual Maximum Date: " + calendar.getActualMaximum(Calendar.DATE));
    }
}
