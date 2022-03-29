package org.kairos.firstVideo;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class FourthExercice {

    public String getDayOfWeekIn40Years(LocalDateTime dateTime, LocalDateTime birthday) {

        int counterMonday = 0, counterThursday = 0,
                counterWednesday = 0, counterTuesday = 0,
                counterFriday = 0, counterSaturday = 0,
                counterSunday = 0;

        LocalDateTime yearsAhead = dateTime.plusYears(40);

        long birthday40Years = ChronoUnit.DAYS.between(dateTime.toLocalDate(), yearsAhead.toLocalDate());

        for (int i = 0; i < birthday40Years; i++) {
            LocalDate localDate = dateTime.toLocalDate().plusDays(i);
            DayOfWeek dayWeek = localDate.getDayOfWeek();
            if (localDate.getDayOfMonth() == 11
                    && localDate.getMonthValue() == 6) {
                if (dayWeek.equals(DayOfWeek.MONDAY)) {
                    counterMonday++;
                } else if (dayWeek.equals(DayOfWeek.TUESDAY)) {
                    counterTuesday++;
                } else if (dayWeek.equals(DayOfWeek.WEDNESDAY)) {
                    counterWednesday++;
                } else if (dayWeek.equals(DayOfWeek.THURSDAY)) {
                    counterThursday++;
                } else if (dayWeek.equals(DayOfWeek.FRIDAY)) {
                    counterFriday++;
                } else if (dayWeek.equals(DayOfWeek.SATURDAY)) {
                    counterSaturday++;
                } else {
                    counterSunday++;
                }
            }
        }

        String result = "El total de lunes es " + counterMonday
                + ", el total de martes: " + counterThursday
                + ", el total de miercoles: " + counterWednesday
                + ", el total de jueves: " + counterTuesday
                + ", el total de viernes: " + counterFriday
                + ", el total de sabados: " + counterSaturday
                + " y el total de domingos: " + counterSunday + ".";

        System.out.println(result);
        return result;
    }

    public void nextBirthday(LocalDateTime birthday) {
        LocalDateTime proof = LocalDateTime.of(2022, Month.JUNE, 5, 6, 45, 50 );
        int sec = (int) Duration.between(proof, birthday).getSeconds();
        int realSec = sec % 60;
        int min = sec / 60;
        int realMin = min % 60;
        int hour = min / 60;
        int realHour = hour % 60;
        int days = hour / 24;
        if (realHour > 24) {
            realHour = realHour - 24;
            days = days + 1;
        }
        System.out.println("Hasta el siguiente cumpleaños hay " + days + " días, " + realHour + " horas, " + realMin + " minutos y " + realSec + " segundos.");
    }

}
