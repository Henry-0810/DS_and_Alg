package Lab6;


import java.time.*;
import java.time.temporal.ChronoUnit;

public class DateCounter {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2023, 2, 26);
        LocalDate date2 = LocalDate.of(2023, 5, 31);
        System.out.println(countDays(date1, date2));
        System.out.println(countNumberOfDOW(DayOfWeek.SATURDAY, date1, date2));
    }

    public static int countDays(LocalDate date1, LocalDate date2){
        return (int) ChronoUnit.DAYS.between(date1,date2);
    }

    public static int countNumberOfDOW(DayOfWeek dayOfWeek,LocalDate date1, LocalDate date2){
        int count = 0;
        while(date1.isBefore(date2)){
            if(date1.getDayOfWeek() == dayOfWeek){
                count++;
            }
            date1 = date1.plusDays(1);
        }
        return count;
    }
}
