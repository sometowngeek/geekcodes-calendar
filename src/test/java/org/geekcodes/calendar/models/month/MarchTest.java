package org.geekcodes.calendar.models.month;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The type March test.
 */
class MarchTest {
    
    /**
     * The constant YEAR.
     */
    public static final int             YEAR       = 2020;
    private final       LocalDate       localDate  = LocalDate.of(2020, Month.MARCH, 1);
    private final       List<LocalDate> marchDates = LocalDate.of(YEAR, Month.MARCH, 1).datesUntil(LocalDate.of(YEAR, Month.APRIL, 1)).collect(Collectors.toList());
    private final       March           march      = new March(YEAR);
    
    /**
     * Sets up.
     */
    @BeforeEach
    void setUp() {
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
        Assertions.assertEquals(new ArrayList<LocalDate>(), march.getHolidays());
    }
    
    /**
     * Test get dates.
     */
    @Test
    void testGetDates() {
        Assertions.assertEquals(marchDates, march.getDates());
    }
    
    /**
     * Test set local date.
     */
    @Test
    void testSetLocalDate() {
        LocalDate expected = LocalDate.of(2025, Month.MARCH, 30);
        
        march.setLocalDate(LocalDate.of(2025, Month.MARCH, 30));
        
        Assertions.assertEquals(expected, march.getLocalDate());
    }
    
    /**
     * Test get holidays static.
     */
    @Test
    void testGetHolidaysStatic() {
        Assertions.assertEquals(new ArrayList<LocalDate>(), March.getHolidays(YEAR));
    }
    
    /**
     * Test get dates static.
     */
    @Test
    void testGetDatesStatic() {
        Assertions.assertEquals(marchDates, March.getDates(YEAR));
    }
}