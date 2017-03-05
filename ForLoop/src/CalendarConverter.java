
public class CalendarConverter {
    public final static int MONDAY = 1;
    public final static int TUESDAY = 2;
    public final static int WEDNSDAY = 3;
    public final static int THURSDAY = 4;
    public final static int FRIDAY = 5;
    public final static int SATURDAY = 6;
    public final static int SUNDAY = 7;

    public static String convertDayToString(int day) {
        String dayOfWeek = null;
        switch (day) {
            case MONDAY:
                dayOfWeek = "Poniedziałek";
                break;
            case TUESDAY:
                dayOfWeek = "Wtorek";
                break;
            case WEDNSDAY:
                dayOfWeek = "Środa";
                break;
            case THURSDAY:
                dayOfWeek = "Czwartek";
                break;
            case FRIDAY:
                dayOfWeek = "Piątek";
                break;
            case SATURDAY:
                dayOfWeek = "Sobota";
                break;
            case SUNDAY:
                dayOfWeek = "Niedziela";
                break;
            default:
                dayOfWeek = "Undefined";
        }
        return dayOfWeek;
    }
}
