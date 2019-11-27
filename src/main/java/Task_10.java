import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Task_10 {
    public static void main(String[] args) {
        WeekDays today = initToday();
        switch (today) {
            case Sunday:
                System.out.println(1);
                break;
            case Monday:
                System.out.println(2);
                break;
            case Tuesday:
                System.out.println(3);
                break;
            case Wednesday:
                System.out.println(4);
                break;
            case Thursday:
                System.out.println(5);
                break;
            case Friday:
                System.out.println(6);
                break;
            case Saturday:
                System.out.println(7);
                break;
        }
    }

    private static WeekDays initToday() {
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        String todayStr = new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date.getTime());
        return WeekDays.valueOf(todayStr);
    }

    public enum WeekDays {
        Sunday,
        Monday,
        Tuesday,
        Wednesday,
        Thursday,
        Friday,
        Saturday
    }
}
