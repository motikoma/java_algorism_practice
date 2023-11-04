package chap1;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Gaus {

    private static final ZoneId ZONE_ID_DEFAULT = ZoneId.of("Asia/Tokyo");
    private static final ZoneId ZONE_ID_UTC = ZoneId.of("UTC");

    // region 現在時刻を取得する

    /**
     * 現在時刻を取得する.
     *
     * @return the current timestamp
     */
    public static Timestamp getCurrentTime() {
        return Timestamp.valueOf(LocalDateTime.now(ZONE_ID_DEFAULT));
    }

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += (1 + 10) * i;
        }

        LocalDateTime now = LocalDateTime.now();

        LocalDateTime nextLimitDate = now
                .withDayOfMonth(11)
                .withHour(0)
                .withMinute(0)
                .withSecond(0)
                .withNano(0);

        System.out.println(getCurrentTime().toLocalDateTime());

//        System.out.println(sum);
    }
}
