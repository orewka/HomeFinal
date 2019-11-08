package datetime;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Task1 {
    public static void main(String[] args) {
        // Есть три рабочие смены:
        // с 7:00 до 15:00
        // с 15:00 до 23:00
        // с 23:00 до 7:00
        // Определить какая сейчас смена (относительно текущего времени)
        LocalTime smena1Start = LocalTime.of(7, 0);
        LocalTime smena1End = LocalTime.of(15, 0);
        LocalTime smena2Start = LocalTime.from(smena1End);
        LocalTime smena2End = LocalTime.of(23, 0);
        LocalTime smena3Start = LocalTime.from(smena2End);
        LocalTime smena3End = LocalTime.of(7, 0);
        LocalTime now = LocalTime.now();
        if (now.isAfter(smena1Start) && now.isBefore(smena1End)) {
            System.out.println("Сейчас 1 смена");
        } else if (now.isAfter(smena2Start) && now.isBefore(smena2End)) {
            System.out.println("Сейчас 2 смена");
        } else if (now.isAfter(smena3Start) && now.isBefore(smena3End)) {
            System.out.println("Сейчас 3 смена");
        }
    }
}
