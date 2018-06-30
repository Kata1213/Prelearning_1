import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 * Created by j3n5en on 2018-06-25 14:13.
 */
class DateTime_21 {
    public static void main(String[] args) {
        for (String key : ZoneId.SHORT_IDS.keySet()) {
            ZoneId zoneId = ZoneId.of(ZoneId.SHORT_IDS.get(key));
            System.out.println(zoneId + ": " + LocalDateTime.now(zoneId));
        }
    }
}
