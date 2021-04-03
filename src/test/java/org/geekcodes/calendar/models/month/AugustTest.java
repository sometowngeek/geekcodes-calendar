package org.geekcodes.calendar.models.month;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

class AugustTest {
    
    private static final int             YEAR = 2020;
    private              List<LocalDate> augustDates;
    private              August           august;
    
    /**
     * Get dates list.
     *
     * @return the list
     */
    static List<LocalDate> getDates() {
        List<LocalDate> dates = new ArrayList<>();
        dates.add(LocalDate.of(YEAR, Month.AUGUST, 1));
        dates.add(LocalDate.of(YEAR, Month.AUGUST, 2));
        dates.add(LocalDate.of(YEAR, Month.AUGUST, 3));
        dates.add(LocalDate.of(YEAR, Month.AUGUST, 4));
        dates.add(LocalDate.of(YEAR, Month.AUGUST, 5));
        dates.add(LocalDate.of(YEAR, Month.AUGUST, 6));
        dates.add(LocalDate.of(YEAR, Month.AUGUST, 7));
        dates.add(LocalDate.of(YEAR, Month.AUGUST, 8));
        dates.add(LocalDate.of(YEAR, Month.AUGUST, 9));
        dates.add(LocalDate.of(YEAR, Month.AUGUST, 10));
        dates.add(LocalDate.of(YEAR, Month.AUGUST, 11));
        dates.add(LocalDate.of(YEAR, Month.AUGUST, 12));
        dates.add(LocalDate.of(YEAR, Month.AUGUST, 13));
        dates.add(LocalDate.of(YEAR, Month.AUGUST, 14));
        dates.add(LocalDate.of(YEAR, Month.AUGUST, 15));
        dates.add(LocalDate.of(YEAR, Month.AUGUST, 16));
        dates.add(LocalDate.of(YEAR, Month.AUGUST, 17));
        dates.add(LocalDate.of(YEAR, Month.AUGUST, 18));
        dates.add(LocalDate.of(YEAR, Month.AUGUST, 19));
        dates.add(LocalDate.of(YEAR, Month.AUGUST, 20));
        dates.add(LocalDate.of(YEAR, Month.AUGUST, 21));
        dates.add(LocalDate.of(YEAR, Month.AUGUST, 22));
        dates.add(LocalDate.of(YEAR, Month.AUGUST, 23));
        dates.add(LocalDate.of(YEAR, Month.AUGUST, 24));
        dates.add(LocalDate.of(YEAR, Month.AUGUST, 25));
        dates.add(LocalDate.of(YEAR, Month.AUGUST, 26));
        dates.add(LocalDate.of(YEAR, Month.AUGUST, 27));
        dates.add(LocalDate.of(YEAR, Month.AUGUST, 28));
        dates.add(LocalDate.of(YEAR, Month.AUGUST, 29));
        dates.add(LocalDate.of(YEAR, Month.AUGUST, 30));
        dates.add(LocalDate.of(YEAR, Month.AUGUST, 31));
        
        return dates;
    }
    
    /**
     * Sets up.
     */
    @BeforeEach
    void setUp() {
        august      = new August(YEAR);
        augustDates = AugustTest.getDates();
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
        Assertions.assertEquals(new ArrayList<LocalDate>(), august.getHolidays());
    }
    
    /**
     * Test get holidays static.
     */
    @Test
    void testGetHolidaysStatic() {
        Assertions.assertEquals(new ArrayList<LocalDate>(), August.getHolidays(YEAR));
    }
    
    /**
     * Test get dates.
     */
    @Test
    void testGetDates() {
        Assertions.assertEquals(augustDates, august.getDates());
    }
    
    /**
     * Test static get dates.
     */
    @Test
    void testStaticGetDates() {
        Assertions.assertEquals(augustDates, August.getDates(2020));
    }
    
    
    /**
     * Test set local date.
     */
    @Test
    void testSetLocalDate() {
        LocalDate expected = LocalDate.of(2025, Month.AUGUST, 30);
        
        august.setLocalDate(LocalDate.of(2025, Month.AUGUST, 30));
        
        Assertions.assertEquals(expected, august.getLocalDate());
    }
}