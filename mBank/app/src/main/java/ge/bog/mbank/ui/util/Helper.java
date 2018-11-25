package ge.bog.mbank.ui.util;

import java.util.Calendar;

public class Helper {
    public static String convertToDate(Long milliseconds, char delimiter) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(milliseconds);
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        return String.format("%02d", day) + delimiter + String.format("%02d", month) + delimiter + year;
    }
}
