package HomeWork12;

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class TimeNow {
    private static TimeNow instance;
    private TimeNow() {}
    public static TimeNow getInstance() {
        if (instance == null) {
            instance = new TimeNow();
        }
        return instance;
    }
    public void showTimeNow() {
        System.out.println(LocalDateTime.now());
    }
}
