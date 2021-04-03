package org.geekcodes.calendar.models.month;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

class MayTest {
    
    private static final int             YEAR = 2020;
    private              List<LocalDate> mayDates;
    private              May             may;
    
    /**
     * Get dates list.
     *
     * @return the list
     */
    static List<LocalDate> getDates() {
        List<LocalDate> dates = new ArrayList<>();
        dates.add(LocalDate.of(YEAR, Month.MAY, 1));
        dates.add(LocalDate.of(YEAR, Month.MAY, 2));
        dates.add(LocalDate.of(YEAR, Month.MAY, 3));
        dates.add(LocalDate.of(YEAR, Month.MAY, 4));
        dates.add(LocalDate.of(YEAR, Month.MAY, 5));
        dates.add(LocalDate.of(YEAR, Month.MAY, 6));
        dates.add(LocalDate.of(YEAR, Month.MAY, 7));
        dates.add(LocalDate.of(YEAR, Month.MAY, 8));
        dates.add(LocalDate.of(YEAR, Month.MAY, 9));
        dates.add(LocalDate.of(YEAR, Month.MAY, 10));
        dates.add(LocalDate.of(YEAR, Month.MAY, 11));
        dates.add(LocalDate.of(YEAR, Month.MAY, 12));
        dates.add(LocalDate.of(YEAR, Month.MAY, 13));
        dates.add(LocalDate.of(YEAR, Month.MAY, 14));
        dates.add(LocalDate.of(YEAR, Month.MAY, 15));
        dates.add(LocalDate.of(YEAR, Month.MAY, 16));
        dates.add(LocalDate.of(YEAR, Month.MAY, 17));
        dates.add(LocalDate.of(YEAR, Month.MAY, 18));
        dates.add(LocalDate.of(YEAR, Month.MAY, 19));
        dates.add(LocalDate.of(YEAR, Month.MAY, 20));
        dates.add(LocalDate.of(YEAR, Month.MAY, 21));
        dates.add(LocalDate.of(YEAR, Month.MAY, 22));
        dates.add(LocalDate.of(YEAR, Month.MAY, 23));
        dates.add(LocalDate.of(YEAR, Month.MAY, 24));
        dates.add(LocalDate.of(YEAR, Month.MAY, 25));
        dates.add(LocalDate.of(YEAR, Month.MAY, 26));
        dates.add(LocalDate.of(YEAR, Month.MAY, 27));
        dates.add(LocalDate.of(YEAR, Month.MAY, 28));
        dates.add(LocalDate.of(YEAR, Month.MAY, 29));
        dates.add(LocalDate.of(YEAR, Month.MAY, 30));
        dates.add(LocalDate.of(YEAR, Month.MAY, 31));
        
        return dates;
    }
    
    
    @BeforeEach
    void setUp() {
        mayDates = MayTest.getDates();
        may      = new May(YEAR);
    }
    
    @AfterEach
    void tearDown() {
    }
    
    @Test
    void testGetDates() {
        Assertions.assertEquals(mayDates, may.getDates());
    }
    
    @Test
    void testGetMemorialDay() {
        Assertions.assertEquals(LocalDate.of(2020, Month.MAY, 25), may.getMemorialDay());
    }
    
    @Test
    void testGetMemorialDayStatic() {
        Assertions.assertEquals(LocalDate.of(2020, Month.MAY, 25), May.getMemorialDay(YEAR));
    }
    
    @Test
    void testGetHolidays() {
        List<LocalDate> dates = new ArrayList<>();
        dates.add(LocalDate.of(2020, Month.MAY, 25));
        Assertions.assertEquals(dates, may.getHolidays());
    }
    
    @Test
    void testGetHolidaysStatic() {
        List<LocalDate> dates = new ArrayList<>();
        dates.add(LocalDate.of(2020, Month.MAY, 25));
        Assertions.assertEquals(dates, May.getHolidays(YEAR));
    }
    
    /**
     * Test set local date.
     */
    @Test
    void testSetLocalDate() {
        LocalDate expected = LocalDate.of(2025, Month.MAY, 30);
        
        may.setLocalDate(LocalDate.of(2025, Month.MAY, 30));
        
        Assertions.assertEquals(expected, may.getLocalDate());
    }
}