import java.util.Calendar;

/**
 * Created by j3n5en on 2018-06-24 18:57.
 */
class DateTime_2 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println("Year: " + calendar.get(Calendar.YEAR));
        System.out.println("Month: " + calendar.get(Calendar.MONTH));
        System.out.println("Day: " + calendar.get(Calendar.DATE));
        System.out.println("Hour: " + calendar.get(Calendar.HOUR));
        System.out.println("Minute: " + calendar.get(Calendar.MINUTE));
    }
}
