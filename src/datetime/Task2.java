package datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Task2 {
    public static void main(String[] args) {
        // Наши занятия закончатся 20 января 2020 года.
        // Сколько занятий осталось, если они проходят 3 раза в неделю (пн, ср, пт).
        // Праздничные дни не учитывать.
        LocalDate endTraining = LocalDate.of(2020,1,20);
        int mon = 0;
        int wen = 0;
        int fri = 0;
        for (LocalDate date = LocalDate.now(); date.isBefore(endTraining) ; date = date.plusDays(1)) {
            if (date.getDayOfWeek() == DayOfWeek.MONDAY) {
                mon++;
            }
            if (date.getDayOfWeek() == DayOfWeek.WEDNESDAY) {
                wen++;
            }
            if (date.getDayOfWeek() == DayOfWeek.FRIDAY) {
                fri++;
            }
        }
        int res = mon + wen + fri;
        System.out.println("До " + endTraining + " осталось занятий " + res);
    }
}
