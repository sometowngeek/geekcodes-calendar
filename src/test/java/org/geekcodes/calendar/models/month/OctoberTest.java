package org.geekcodes.calendar.models.month;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The type October test.
 */
class OctoberTest {
    
    private static final int             YEAR = 2020;
    private              List<LocalDate> octoberDates;
    private              List<LocalDate> octoberHolidays;
    private              October       october;
    
    /**
     * Get dates list.
     *
     * @return the list
     */
    static List<LocalDate> getDates() {
        List<LocalDate> dates = new ArrayList<>();
        dates.add(LocalDate.of(YEAR, Month.OCTOBER, 1));
        dates.add(LocalDate.of(YEAR, Month.OCTOBER, 2));
        dates.add(LocalDate.of(YEAR, Month.OCTOBER, 3));
        dates.add(LocalDate.of(YEAR, Month.OCTOBER, 4));
        dates.add(LocalDate.of(YEAR, Month.OCTOBER, 5));
        dates.add(LocalDate.of(YEAR, Month.OCTOBER, 6));
        dates.add(LocalDate.of(YEAR, Month.OCTOBER, 7));
        dates.add(LocalDate.of(YEAR, Month.OCTOBER, 8));
        dates.add(LocalDate.of(YEAR, Month.OCTOBER, 9));
        dates.add(LocalDate.of(YEAR, Month.OCTOBER, 10));
        dates.add(LocalDate.of(YEAR, Month.OCTOBER, 11));
        dates.add(LocalDate.of(YEAR, Month.OCTOBER, 12));
        dates.add(LocalDate.of(YEAR, Month.OCTOBER, 13));
        dates.add(LocalDate.of(YEAR, Month.OCTOBER, 14));
        dates.add(LocalDate.of(YEAR, Month.OCTOBER, 15));
        dates.add(LocalDate.of(YEAR, Month.OCTOBER, 16));
        dates.add(LocalDate.of(YEAR, Month.OCTOBER, 17));
        dates.add(LocalDate.of(YEAR, Month.OCTOBER, 18));
        dates.add(LocalDate.of(YEAR, Month.OCTOBER, 19));
        dates.add(LocalDate.of(YEAR, Month.OCTOBER, 20));
        dates.add(LocalDate.of(YEAR, Month.OCTOBER, 21));
        dates.add(LocalDate.of(YEAR, Month.OCTOBER, 22));
        dates.add(LocalDate.of(YEAR, Month.OCTOBER, 23));
        dates.add(LocalDate.of(YEAR, Month.OCTOBER, 24));
        dates.add(LocalDate.of(YEAR, Month.OCTOBER, 25));
        dates.add(LocalDate.of(YEAR, Month.OCTOBER, 26));
        dates.add(LocalDate.of(YEAR, Month.OCTOBER, 27));
        dates.add(LocalDate.of(YEAR, Month.OCTOBER, 28));
        dates.add(LocalDate.of(YEAR, Month.OCTOBER, 29));
        dates.add(LocalDate.of(YEAR, Month.OCTOBER, 30));
        dates.add(LocalDate.of(YEAR, Month.OCTOBER, 31));
        
        return dates;
    }
    
    /**
     * Sets up.
     */
    @BeforeEach
    void setUp() {
        october      = new October(YEAR);
        octoberDates = OctoberTest.getDates();
        octoberHolidays = OctoberTest.getHolidays();
    }
    
    /**
     * Gets holidays.
     *
     * @return the holidays
     */
    public static List<LocalDate> getHolidays() {
        List<LocalDate> holidays = new ArrayList<>();
        holidays.add(LocalDate.of(YEAR, Month.OCTOBER, 31));
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
        Assertions.assertEquals(octoberHolidays, october.getHolidays());
    }
    
    /**
     * Test get holidays static.
     */
    @Test
    void testGetHolidaysStatic() {
        Assertions.assertEquals(octoberHolidays, October.getHolidays(YEAR));
    }
    
    /**
     * Test get dates.
     */
    @Test
    void testGetDates() {
        Assertions.assertEquals(octoberDates, october.getDates());
    }
    
    /**
     * Test static get dates.
     */
    @Test
    void testStaticGetDates() {
        Assertions.assertEquals(octoberDates, October.getDates(YEAR));
    }
    
    
    /**
     * Test set local date.
     */
    @Test
    void testSetLocalDate() {
        LocalDate expected = LocalDate.of(2025, Month.OCTOBER, 30);
        
        october.setLocalDate(LocalDate.of(2025, Month.OCTOBER, 30));
        
        Assertions.assertEquals(expected, october.getLocalDate());
    }
    
    /**
     * Gets halloween.
     */
    @Test
    void getHalloween() {
        LocalDate expected = LocalDate.of(YEAR, Month.OCTOBER, 31);
        Assertions.assertEquals(expected, october.getHalloween());
    }
    
    /**
     * Test get halloween.
     */
    @Test
    void testGetHalloween() {
        LocalDate expected = LocalDate.of(YEAR, Month.OCTOBER, 31);
        Assertions.assertEquals(expected, October.getHalloween(YEAR));
    }
}