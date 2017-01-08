public class Day {
    public static void main(String[] args) {
        int dayOfWeek = 2;
        String dayName = null;
        switch(dayOfWeek){
            case 1:
                dayName = "Poniedzialek";
                break;
            case 2:
                dayName = "Wtorek";
                break;
            case 3:
                dayName = "Sroda";
                break;
            case 4:
                dayName = "Czwartek";
                break;
            case 5:
                dayName = "Piatek";
                break;
            case 6:
                dayName = "Sobota";
                break;
            case 7:
                dayName = "Niedziela";
                break;
            //
        }

        String dayType = null;
        if(dayOfWeek > 0 && dayOfWeek <= 5) {
            dayType = "Pracujący";
        } else if(dayOfWeek >5 && dayOfWeek <=7) {
            dayType = "Niepracujący";
        }

        if(dayName == null) {
            System.out.println("Niepoprawny numer dnia");
        } else {
            System.out.println("Dzień nr: " + dayOfWeek);
            System.out.println(dayName + " to dzień " + dayType);
        }
    }
}