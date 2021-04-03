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
 * The type April test.
 */
class AprilTest {
    
    private static final int             YEAR = 2020;
    private              List<LocalDate> aprilDates;
    private              April           april;
    
    /**
     * Get dates list.
     *
     * @return the list
     */
    static List<LocalDate> getDates() {
        List<LocalDate> dates = new ArrayList<>();
        dates.add(LocalDate.of(YEAR, java.time.Month.APRIL, 1));
        dates.add(LocalDate.of(YEAR, java.time.Month.APRIL, 2));
        dates.add(LocalDate.of(YEAR, java.time.Month.APRIL, 3));
        dates.add(LocalDate.of(YEAR, java.time.Month.APRIL, 4));
        dates.add(LocalDate.of(YEAR, java.time.Month.APRIL, 5));
        dates.add(LocalDate.of(YEAR, java.time.Month.APRIL, 6));
        dates.add(LocalDate.of(YEAR, java.time.Month.APRIL, 7));
        dates.add(LocalDate.of(YEAR, java.time.Month.APRIL, 8));
        dates.add(LocalDate.of(YEAR, java.time.Month.APRIL, 9));
        dates.add(LocalDate.of(YEAR, java.time.Month.APRIL, 10));
        dates.add(LocalDate.of(YEAR, java.time.Month.APRIL, 11));
        dates.add(LocalDate.of(YEAR, java.time.Month.APRIL, 12));
        dates.add(LocalDate.of(YEAR, java.time.Month.APRIL, 13));
        dates.add(LocalDate.of(YEAR, java.time.Month.APRIL, 14));
        dates.add(LocalDate.of(YEAR, java.time.Month.APRIL, 15));
        dates.add(LocalDate.of(YEAR, java.time.Month.APRIL, 16));
        dates.add(LocalDate.of(YEAR, java.time.Month.APRIL, 17));
        dates.add(LocalDate.of(YEAR, java.time.Month.APRIL, 18));
        dates.add(LocalDate.of(YEAR, java.time.Month.APRIL, 19));
        dates.add(LocalDate.of(YEAR, java.time.Month.APRIL, 20));
        dates.add(LocalDate.of(YEAR, java.time.Month.APRIL, 21));
        dates.add(LocalDate.of(YEAR, java.time.Month.APRIL, 22));
        dates.add(LocalDate.of(YEAR, java.time.Month.APRIL, 23));
        dates.add(LocalDate.of(YEAR, java.time.Month.APRIL, 24));
        dates.add(LocalDate.of(YEAR, java.time.Month.APRIL, 25));
        dates.add(LocalDate.of(YEAR, java.time.Month.APRIL, 26));
        dates.add(LocalDate.of(YEAR, java.time.Month.APRIL, 27));
        dates.add(LocalDate.of(YEAR, java.time.Month.APRIL, 28));
        dates.add(LocalDate.of(YEAR, java.time.Month.APRIL, 29));
        dates.add(LocalDate.of(YEAR, java.time.Month.APRIL, 30));
        
        return dates;
    }
    
    /**
     * Sets up.
     */
    @BeforeEach
    void setUp() {
        april      = new April(YEAR);
        aprilDates = AprilTest.getDates();
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
        Assertions.assertEquals(new ArrayList<LocalDate>(), april.getHolidays());
    }
    
    /**
     * Test get holidays static.
     */
    @Test
    void testGetHolidaysStatic() {
        Assertions.assertEquals(new ArrayList<LocalDate>(), April.getHolidays(YEAR));
    }
    
    /**
     * Test get dates.
     */
    @Test
    void testGetDates() {
        Assertions.assertEquals(aprilDates, april.getDates());
    }
    
    /**
     * Test static get dates.
     */
    @Test
    void testStaticGetDates() {
        Assertions.assertEquals(aprilDates, April.getDates(2020));
    }
    
    
    /**
     * Test set local date.
     */
    @Test
    void testSetLocalDate() {
        LocalDate expected = LocalDate.of(2025, Month.APRIL, 30);
        
        april.setLocalDate(LocalDate.of(2025, Month.APRIL, 30));
        
        Assertions.assertEquals(expected, april.getLocalDate());
    }
}