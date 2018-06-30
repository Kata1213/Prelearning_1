import java.time.YearMonth;

/**
 * Created by j3n5en on 2018-06-25 14:39.
 */
class DateTime_26 {
    public static void main(String[] args) {
        YearMonth now = YearMonth.of(2018, 2);
        System.out.println("Integer value of the current month: " + now.getMonth().getValue());
        System.out.println("Length of the month: " + now.lengthOfMonth());
        System.out.println("Maximum length of the month: " + now.getMonth().maxLength());
        System.out.println("First month of the Quarter:" + now.getMonth().firstMonthOfQuarter());
    }
}
