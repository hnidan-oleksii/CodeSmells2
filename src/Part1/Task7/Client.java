package Part1.Task7;

import java.util.Calendar;

public class Client {
    // Інші методи класу...
    public void doSomething() {
        Calendar currentDate = Calendar.getInstance();
        if (isWeekend(currentDate)) {
            System.out.println("It's weekend!");
        } else {
            System.out.println("It's not weekend!");
        }
    }

    private boolean isWeekend(Calendar currentDate) {
        int dayOfWeek = currentDate.get(Calendar.DAY_OF_WEEK);
        return dayOfWeek == Calendar.SATURDAY || dayOfWeek == Calendar.SUNDAY;
    }
}

