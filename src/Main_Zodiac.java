import java.time.LocalDate;
import java.time.Month;

public class Main_Zodiac {

    public  static void main(String[] args){
        switch (signsRange()){
            case CAPRICORN:
                System.out.println("Current Zodiac sign is * CAPRICORN *");
                break;

            case AQUARIUS:
                System.out.println("Current Zodiac sign is * AQUARIUS *");
                break;

            default:
                System.out.println("Unable to determine Zodiac sign");
        }

    }

    public static Zodiac_Signs signsRange(){
        LocalDate currentDate = LocalDate.now();

        Month month = currentDate.getMonth();
        int monthValue = currentDate.getMonthValue();
        String currentMonth = month.toString();

        int dayOfMonth = currentDate.getDayOfMonth();

        switch (monthValue){
            case 12:
                switch (dayOfMonth){
                case 22: case 23: case 24:case 25: case 26: case 27: case 28: case 29: case 30: case 31:
                        return Zodiac_Signs.CAPRICORN;
                }
            case 1:
                switch (dayOfMonth){
                    case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10:
                    case 11: case 12: case 13: case 14: case 15: case 16: case 17: case 18: case 19:
                        return Zodiac_Signs.CAPRICORN;
                }
            default:
                return Zodiac_Signs.UNRECOGNIZED;

        }

    }
}