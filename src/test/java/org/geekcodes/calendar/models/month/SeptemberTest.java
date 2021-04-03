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
 * The type September test.
 */
class SeptemberTest {
    
    private static final int             YEAR = 2020;
    private              List<LocalDate> septemberDates;
    private              List<LocalDate> septemberHolidays;
    private              September       september;
    
    /**
     * Get dates list.
     *
     * @return the list
     */
    static List<LocalDate> getDates() {
        List<LocalDate> dates = new ArrayList<>();
        dates.add(LocalDate.of(YEAR, Month.SEPTEMBER, 1));
        dates.add(LocalDate.of(YEAR, Month.SEPTEMBER, 2));
        dates.add(LocalDate.of(YEAR, Month.SEPTEMBER, 3));
        dates.add(LocalDate.of(YEAR, Month.SEPTEMBER, 4));
        dates.add(LocalDate.of(YEAR, Month.SEPTEMBER, 5));
        dates.add(LocalDate.of(YEAR, Month.SEPTEMBER, 6));
        dates.add(LocalDate.of(YEAR, Month.SEPTEMBER, 7));
        dates.add(LocalDate.of(YEAR, Month.SEPTEMBER, 8));
        dates.add(LocalDate.of(YEAR, Month.SEPTEMBER, 9));
        dates.add(LocalDate.of(YEAR, Month.SEPTEMBER, 10));
        dates.add(LocalDate.of(YEAR, Month.SEPTEMBER, 11));
        dates.add(LocalDate.of(YEAR, Month.SEPTEMBER, 12));
        dates.add(LocalDate.of(YEAR, Month.SEPTEMBER, 13));
        dates.add(LocalDate.of(YEAR, Month.SEPTEMBER, 14));
        dates.add(LocalDate.of(YEAR, Month.SEPTEMBER, 15));
        dates.add(LocalDate.of(YEAR, Month.SEPTEMBER, 16));
        dates.add(LocalDate.of(YEAR, Month.SEPTEMBER, 17));
        dates.add(LocalDate.of(YEAR, Month.SEPTEMBER, 18));
        dates.add(LocalDate.of(YEAR, Month.SEPTEMBER, 19));
        dates.add(LocalDate.of(YEAR, Month.SEPTEMBER, 20));
        dates.add(LocalDate.of(YEAR, Month.SEPTEMBER, 21));
        dates.add(LocalDate.of(YEAR, Month.SEPTEMBER, 22));
        dates.add(LocalDate.of(YEAR, Month.SEPTEMBER, 23));
        dates.add(LocalDate.of(YEAR, Month.SEPTEMBER, 24));
        dates.add(LocalDate.of(YEAR, Month.SEPTEMBER, 25));
        dates.add(LocalDate.of(YEAR, Month.SEPTEMBER, 26));
        dates.add(LocalDate.of(YEAR, Month.SEPTEMBER, 27));
        dates.add(LocalDate.of(YEAR, Month.SEPTEMBER, 28));
        dates.add(LocalDate.of(YEAR, Month.SEPTEMBER, 29));
        dates.add(LocalDate.of(YEAR, Month.SEPTEMBER, 30));
        
        return dates;
    }
    
    /**
     * Sets up.
     */
    @BeforeEach
    void setUp() {
        september      = new September(YEAR);
        septemberDates = SeptemberTest.getDates();
        septemberHolidays = SeptemberTest.getHolidays();
    }
    
    /**
     * Gets holidays.
     *
     * @return the holidays
     */
    public static List<LocalDate> getHolidays() {
        List<LocalDate> holidays = new ArrayList<>();
        holidays.add(LocalDate.of(YEAR, Month.SEPTEMBER, 7));
        return holidays;
    }
    
    /**
     * Tear down.
     */
    @AfterEach
    void tearDown() {
    }
    
    /**
     * Test get holidays.
     */
    @Test
    void testGetHolidays() {
        Assertions.assertEquals(septemberHolidays, september.getHolidays());
    }
    
    /**
     * Test get holidays static.
     */
    @Test
    void testGetHolidaysStatic() {
        Assertions.assertEquals(septemberHolidays, September.getHolidays(YEAR));
    }
    
    /**
     * Test get dates.
     */
    @Test
    void testGetDates() {
        Assertions.assertEquals(septemberDates, september.getDates());
    }
    
    /**
     * Test static get dates.
     */
    @Test
    void testStaticGetDates() {
        Assertions.assertEquals(septemberDates, September.getDates(YEAR));
    }
    
    
    /**
     * Test set local date.
     */
    @Test
    void testSetLocalDate() {
        LocalDate expected = LocalDate.of(2025, Month.SEPTEMBER, 30);
        
        september.setLocalDate(LocalDate.of(2025, Month.SEPTEMBER, 30));
        
        Assertions.assertEquals(expected, september.getLocalDate());
    }
    
    /**
     * Test get labor day.
     */
    @Test
    void testGetLaborDay() {
        LocalDate expected = LocalDate.of(YEAR, Month.SEPTEMBER, 7);
        
        Assertions.assertEquals(expected, september.getLaborDay());
    }
    
    /**
     * Test get labor day static.
     */
    @Test
    void testGetLaborDayStatic() {
        LocalDate expected = LocalDate.of(YEAR, Month.SEPTEMBER, 7);
    
        Assertions.assertEquals(expected, September.getLaborDay(YEAR));
    }
}