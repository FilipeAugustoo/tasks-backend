package br.ce.wcaquino.taskbackend.utils;

import static org.junit.Assert.*;
import org.junit.Test;

import java.time.LocalDate;

public class DateUtilsTest {

    @Test
    public void shouldReturnTrueForFutureDates() {
        LocalDate date = LocalDate.of(2030, 1, 1);
        assertTrue(DateUtils.isEqualOrFutureDate(date));
    }

    @Test
    public void shouldReturnFalseForPastDates() {
        LocalDate date = LocalDate.of(2010, 1, 1);
        assertFalse(DateUtils.isEqualOrFutureDate(date));
    }

    @Test
    public void shouldReturnTrueForCurrentDate() {
        LocalDate date = LocalDate.now();
        assertTrue(DateUtils.isEqualOrFutureDate(date));
    }
}