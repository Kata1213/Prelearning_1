import java.util.Calendar;

/**
 * Created by j3n5en on 2018-06-25 13:43.
 */
class DateTime_13 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(8012, 11, 11);
        System.out.println("day of the week: " + cal.get(Calendar.DAY_OF_WEEK));
    }
}
