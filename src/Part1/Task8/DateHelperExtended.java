package Part1.Task8;

import java.util.Date;

public class DateHelperExtended extends DateHelper {
    public static Date calculateDateDifference(Date date1, Date date2) {
        return new Date(date1.getTime() - date2.getTime());
    }
}
