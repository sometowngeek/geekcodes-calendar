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
 * The type January test.
 */
class JanuaryTest {
    
    /**
     * The constant YEAR.
     */
    public static final int             YEAR = 2020;
    private             LocalDate       localDate;
    private             List<LocalDate> januaryDates;
    private             January         january;
    
    /**
     * Gets dates.
     *
     * @return the dates
     */
    public static List<LocalDate> getDates() {
        List<LocalDate> dates = new ArrayList<>();
        
        for (int d = 1; d <= 31; d++) {
            dates.add(LocalDate.of(YEAR, Month.JANUARY, d));
        }
        
        return dates;
    }
    
    /**
     * Sets up.
     */
    @BeforeEach
    void setUp() {
        localDate    = LocalDate.of(2020, Month.JANUARY, 1);
        januaryDates = getDates();
        january      = new January(YEAR);
    }
    
    /**
     * Tear down.
     */
    @AfterEach
    void tearDown() {
    }
    
    /**
     * Test get dates.
     */
    @Test
    void testGetDates() {
        Assertions.assertEquals(januaryDates, january.getDates());
    }
    
    /**
     * Test get martin luther king jr date.
     */
    @Test
    void testGetMartinLutherKingJrDate() {
        LocalDate expected   = LocalDate.of(2020, Month.JANUARY, 20);
        LocalDate actualDate = january.getMartinLutherKingJrDate();
        
        Assertions.assertEquals(expected, actualDate);
    }
    
    /**
     * Test get martin luther king jr date.
     */
    @Test
    void testGetMartinLutherKingJrDateStatic() {
        LocalDate expected   = LocalDate.of(2020, Month.JANUARY, 20);
        LocalDate actualDate = January.getMartinLutherKingJrDate(YEAR);
        
        Assertions.assertEquals(expected, actualDate);
    }
    
    /**
     * Test set local date.
     */
    @Test
    void testSetLocalDate() {
        LocalDate expected = LocalDate.of(2025, Month.JANUARY, 30);
        
        january.setLocalDate(LocalDate.of(2025, Month.JANUARY, 30));
        
        Assertions.assertEquals(expected, january.getLocalDate());
    }
    
    /**
     * Test get new year date.
     */
    @Test
    void testGetNewYearDate() {
        Assertions.assertEquals(LocalDate.of(YEAR, Month.JANUARY, 1), january.getNewYearDate());
    }
    
    
    /**
     * Test get new year date.
     */
    @Test
    void testGetNewYearDateStatic() {
        Assertions.assertEquals(LocalDate.of(YEAR, Month.JANUARY, 1), January.getNewYearDate(YEAR));
    }
    
    /**
     * Test get holidays.
     */
    @Test
    void testGetHolidays() {
        List<LocalDate> januaryHolidays = new ArrayList<>();
        januaryHolidays.add(LocalDate.of(YEAR, Month.JANUARY, 1));
        januaryHolidays.add(LocalDate.of(YEAR, Month.JANUARY, 20));
        
        Assertions.assertEquals(januaryHolidays, january.getHolidays());
    }
    
    /**
     * Test get dates static.
     */
    @Test
    void testGetDatesStatic() {
        Assertions.assertEquals(JanuaryTest.getDates(), January.getDates(YEAR));
    }
    
    /**
     * Test get holidays static.
     */
    @Test
    void testGetHolidaysStatic() {
        List<LocalDate> januaryHolidays = new ArrayList<>();
        januaryHolidays.add(LocalDate.of(YEAR, Month.JANUARY, 1));
        januaryHolidays.add(LocalDate.of(YEAR, Month.JANUARY, 20));
        
        Assertions.assertEquals(januaryHolidays, January.getHolidays(YEAR));
    }
}