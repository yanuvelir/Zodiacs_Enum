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
            case PISCES:
                System.out.println("Current Zodiac sign is * PISCES *");
                break;
            case ARIES:
                System.out.println("Current Zodiac sign is * ARIES *");
                break;
            case TAURUS:
                System.out.println("Current Zodiac sign is * TAURUS *");
                break;
            case GEMINI:
                System.out.println("Current Zodiac sign is * GEMINI *");
            case CANCER:
                System.out.println("Current Zodiac sign is * CANCER *");
                break;
            case LEO:
                System.out.println("Current Zodiac sign is * LEO *");
                break;
            case VIRGO:
                System.out.println("Current Zodiac sign is * VIRGO *");
                break;
            case LIBRA:
                System.out.println("Current Zodiac sign is * LIBRA *");
                break;
            case SCORPIO:
                System.out.println("Current Zodiac sign is * SCORPIO *");
                break;
            case SAGITTARIUS:
                System.out.println("Current Zodiac sign is * SAGITTARIUS *");
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
                    case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10:
                    case 11: case 12: case 13: case 14: case 15: case 16: case 17: case 18: case 19:
                    case 20: case 21:
                        return Zodiac_Signs.SAGITTARIUS;
                case 22: case 23: case 24:case 25: case 26: case 27: case 28: case 29: case 30: case 31:
                        return Zodiac_Signs.CAPRICORN;
                }
            case 1:
                switch (dayOfMonth){
                    case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10:
                    case 11: case 12: case 13: case 14: case 15: case 16: case 17: case 18: case 19:
                        return Zodiac_Signs.CAPRICORN;
                    case 20: case 21: case 22: case 23: case 24: case 25: case 26: case 27: case 28:
                    case 29: case 30: case 31:
                        return Zodiac_Signs.AQUARIUS;
                        }
            case 2:
                switch (dayOfMonth){
                    case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10:
                    case 11: case 12: case 13: case 14: case 15: case 16: case 17: case 18:
                        return Zodiac_Signs.AQUARIUS;
                    case 19: case 20: case 21: case 22: case 23: case 24: case 25: case 26: case 27:
                    case 28: case 29:
                        return Zodiac_Signs.PISCES;
                }
            case 3:
                switch (dayOfMonth){
                    case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10:
                    case 11: case 12: case 13: case 14: case 15: case 16: case 17: case 18: case 19:
                    case 20:
                        return Zodiac_Signs.PISCES;
                    case 21: case 22: case 23: case 24: case 25: case 26: case 27: case 28:
                    case 29: case 30: case 31:
                        return Zodiac_Signs.ARIES;
                }
            case 4:
                switch (dayOfMonth){
                    case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10:
                    case 11: case 12: case 13: case 14: case 15: case 16: case 17: case 18: case 19:
                        return Zodiac_Signs.ARIES;
                    case 20: case 21: case 22: case 23: case 24: case 25: case 26: case 27:
                    case 28: case 29: case 30:
                        return Zodiac_Signs.TAURUS;
                }
            case 5:
                switch (dayOfMonth){
                    case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10:
                    case 11: case 12: case 13: case 14: case 15: case 16: case 17: case 18: case 19:
                    case 20:
                        return Zodiac_Signs.TAURUS;
                    case 21: case 22: case 23: case 24: case 25: case 26: case 27:
                    case 28: case 29: case 30: case 31:
                        return Zodiac_Signs.GEMINI;
                }
            case 6:
                switch (dayOfMonth){
                    case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10:
                    case 11: case 12: case 13: case 14: case 15: case 16: case 17: case 18: case 19:
                    case 20:
                        return Zodiac_Signs.GEMINI;
                    case 21: case 22: case 23: case 24: case 25: case 26: case 27:
                    case 28: case 29: case 30:
                        return Zodiac_Signs.CANCER;
                }
            case 7:
                switch (dayOfMonth){
                    case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10:
                    case 11: case 12: case 13: case 14: case 15: case 16: case 17: case 18: case 19:
                    case 20: case 21: case 22:
                        return Zodiac_Signs.CANCER;
                    case 23: case 24: case 25: case 26: case 27:
                    case 28: case 29: case 30: case 31:
                        return Zodiac_Signs.LEO;
                }
            case 8:
                switch (dayOfMonth){
                    case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10:
                    case 11: case 12: case 13: case 14: case 15: case 16: case 17: case 18: case 19:
                    case 20: case 21: case 22:
                        return Zodiac_Signs.LEO;
                    case 23: case 24: case 25: case 26: case 27:
                    case 28: case 29: case 30: case 31:
                        return Zodiac_Signs.VIRGO;
                }
            case 9:
                switch (dayOfMonth){
                    case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10:
                    case 11: case 12: case 13: case 14: case 15: case 16: case 17: case 18: case 19:
                    case 20: case 21: case 22:
                        return Zodiac_Signs.VIRGO;
                    case 23: case 24: case 25: case 26: case 27:
                    case 28: case 29: case 30:
                        return Zodiac_Signs.LIBRA;
                }
            case 10:
                switch (dayOfMonth){
                    case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10:
                    case 11: case 12: case 13: case 14: case 15: case 16: case 17: case 18: case 19:
                    case 20: case 21: case 22:
                        return Zodiac_Signs.LIBRA;
                    case 23: case 24: case 25: case 26: case 27:
                    case 28: case 29: case 30: case 31:
                        return Zodiac_Signs.SCORPIO;
                }
            case 11:
                switch (dayOfMonth){
                    case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10:
                    case 11: case 12: case 13: case 14: case 15: case 16: case 17: case 18: case 19:
                    case 20: case 21:
                        return Zodiac_Signs.SCORPIO;
                    case 22: case 23: case 24: case 25: case 26: case 27:
                    case 28: case 29: case 30:
                        return  Zodiac_Signs.SAGITTARIUS;
                }
            default:
                return Zodiac_Signs.UNRECOGNIZED;
        }
    }
}
