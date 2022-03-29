package org.kairos.firstVideoTests;

import org.junit.Assert;
import org.junit.Test;
import org.kairos.firstVideo.FourthExercice;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;

public class DateTest {

    @Test
    public void until40Years() {
        FourthExercice fourthExercice = new FourthExercice();
        LocalDateTime nextBirthDayTime = LocalDateTime.of(2022, Month.JUNE, 11, 10, 30, 25);
        LocalDateTime today = LocalDateTime.now();

        fourthExercice.getDayOfWeekIn40Years(today, nextBirthDayTime);

    }
    @Test
    public void nextBirthday() {
        FourthExercice fourthExercice = new FourthExercice();
        LocalDateTime nextBirthDayTime = LocalDateTime.of(2022, Month.JUNE, 11, 10, 30, 25);

        fourthExercice.nextBirthday(nextBirthDayTime);
    }

}
