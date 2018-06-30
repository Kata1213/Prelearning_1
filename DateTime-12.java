import java.text.DateFormatSymbols;
import java.util.Locale;

/**
 * Created by j3n5en on 2018-06-25 13:40.
 */
class DateTime_12 {
    public static void main(String[] args) {
        DateFormatSymbols symbols = new DateFormatSymbols(new Locale("zh"));
        String[] dayNames = symbols.getWeekdays();
        for (String s : dayNames) {
            System.out.println(s);
        }

    }
}
