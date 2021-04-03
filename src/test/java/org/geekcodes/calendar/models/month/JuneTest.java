package org.geekcodes.calendar.models.month;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

/**
 * The type June test.
 */
class JuneTest {
    
    private static final int             YEAR = 2020;
    private              List<LocalDate> juneDates;
    private              List<LocalDate> juneHolidays;
    private              June            june;
    
    /**
     * Get dates list.
     *
     * @return the list
     */
    static List<LocalDate> getDates() {
        List<LocalDate> dates = new ArrayList<>();
        dates.add(LocalDate.of(YEAR, Month.JUNE, 1));
        dates.add(LocalDate.of(YEAR, Month.JUNE, 2));
        dates.add(LocalDate.of(YEAR, Month.JUNE, 3));
        dates.add(LocalDate.of(YEAR, Month.JUNE, 4));
        dates.add(LocalDate.of(YEAR, Month.JUNE, 5));
        dates.add(LocalDate.of(YEAR, Month.JUNE, 6));
        dates.add(LocalDate.of(YEAR, Month.JUNE, 7));
        dates.add(LocalDate.of(YEAR, Month.JUNE, 8));
        dates.add(LocalDate.of(YEAR, Month.JUNE, 9));
        dates.add(LocalDate.of(YEAR, Month.JUNE, 10));
        dates.add(LocalDate.of(YEAR, Month.JUNE, 11));
        dates.add(LocalDate.of(YEAR, Month.JUNE, 12));
        dates.add(LocalDate.of(YEAR, Month.JUNE, 13));
        dates.add(LocalDate.of(YEAR, Month.JUNE, 14));
        dates.add(LocalDate.of(YEAR, Month.JUNE, 15));
        dates.add(LocalDate.of(YEAR, Month.JUNE, 16));
        dates.add(LocalDate.of(YEAR, Month.JUNE, 17));
        dates.add(LocalDate.of(YEAR, Month.JUNE, 18));
        dates.add(LocalDate.of(YEAR, Month.JUNE, 19));
        dates.add(LocalDate.of(YEAR, Month.JUNE, 20));
        dates.add(LocalDate.of(YEAR, Month.JUNE, 21));
        dates.add(LocalDate.of(YEAR, Month.JUNE, 22));
        dates.add(LocalDate.of(YEAR, Month.JUNE, 23));
        dates.add(LocalDate.of(YEAR, Month.JUNE, 24));
        dates.add(LocalDate.of(YEAR, Month.JUNE, 25));
        dates.add(LocalDate.of(YEAR, Month.JUNE, 26));
        dates.add(LocalDate.of(YEAR, Month.JUNE, 27));
        dates.add(LocalDate.of(YEAR, Month.JUNE, 28));
        dates.add(LocalDate.of(YEAR, Month.JUNE, 29));
        dates.add(LocalDate.of(YEAR, Month.JUNE, 30));
        
        return dates;
    }
    
    /**
     * Sets up.
     */
    @BeforeEach
    void setUp() {
        june      = new June(YEAR);
        juneDates = getDates();
        juneHolidays = new ArrayList<>();
    }
    
    /**
     * Tear down.
     */
    @AfterEach
    void tearDown() {
    }
    
    /**
     * Test set local date.
     */
    @Test
    void testSetLocalDate() {
        Assertions.assertDoesNotThrow(() -> june.setLocalDate(LocalDate.of(YEAR, Month.JUNE, 5)));
    }
    
    /**
     * Test get dates.
     */
    @Test
    void testGetDates() {
        Assertions.assertEquals(juneDates, june.getDates());
    }
    
    /**
     * Test get dates static.
     */
    @Test
    void testGetDatesStatic() {
        Assertions.assertEquals(juneDates, June.getDates(YEAR));
    }
    
    /**
     * Test get holidays.
     */
    @Test
    void testGetHolidays() {
        Assertions.assertEquals(juneHolidays, june.getHolidays());
    }
    
    /**
     * Test get holidays static.
     */
    @Test
    void testGetHolidaysStatic() {
        Assertions.assertEquals(juneHolidays, June.getHolidays(YEAR));
    }
}