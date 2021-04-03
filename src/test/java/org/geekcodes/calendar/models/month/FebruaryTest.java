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
 * The type February test.
 */
class FebruaryTest {
    
    private static final int             LEAP_YEAR     = 2020;
    private static final int             NOT_LEAP_YEAR = 2021;
    private              List<LocalDate> februaryDatesLeapYear;
    private              February        februaryLeapYear;
    private              List<LocalDate> februaryDatesNotLeapYear;
    private              February        februaryNotLeapYear;
    
    /**
     * Gets dates.
     *
     * @param leapYear the leap year
     *
     * @return the dates
     */
    public static List<LocalDate> getDates(boolean leapYear) {
        List<LocalDate> dates = new ArrayList<>();
        
        final int year = leapYear ? LEAP_YEAR : NOT_LEAP_YEAR;
        
        int maxDays = leapYear ? 29 : 28;
        
        for (int d = 1; d <= maxDays; d++) {
            dates.add(LocalDate.of(year, Month.FEBRUARY, d));
        }
        
        return dates;
    }
    
    /**
     * Sets up.
     */
    @BeforeEach
    void setUp() {
        februaryLeapYear         = new February(LEAP_YEAR);
        februaryNotLeapYear      = new February(LEAP_YEAR + 1);
        februaryDatesLeapYear    = FebruaryTest.getDates(true);
        februaryDatesNotLeapYear = FebruaryTest.getDates(false);
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
        List<LocalDate> expectedDates = new ArrayList<>();
        expectedDates.add(LocalDate.of(LEAP_YEAR, Month.FEBRUARY, 17));
        
        Assertions.assertEquals(expectedDates, februaryLeapYear.getHolidays());
    }
    
    /**
     * Test get holidays static.
     */
    @Test
    void testGetHolidaysStatic() {
        List<LocalDate> expectedDates = new ArrayList<>();
        expectedDates.add(LocalDate.of(LEAP_YEAR, Month.FEBRUARY, 17));
        
        Assertions.assertEquals(expectedDates, February.getHolidays(LEAP_YEAR));
    }
    
    
    /**
     * Test get presidents day.
     */
    @Test
    void testGetPresidentsDay() {
        LocalDate expectedLocalDate = LocalDate.of(LEAP_YEAR, Month.FEBRUARY, 17);
        Assertions.assertEquals(expectedLocalDate, februaryLeapYear.getPresidentsDay());
    }
    
    /**
     * Test get dates.
     */
    @Test
    void testGetDatesLeapYear() {
        Assertions.assertEquals(februaryDatesLeapYear, februaryLeapYear.getDates());
        Assertions.assertNotEquals(februaryDatesNotLeapYear, februaryLeapYear.getDates());
    }
    
    /**
     * Test get dates.
     */
    @Test
    void testGetDatesNotLeapYear() {
        Assertions.assertEquals(februaryDatesNotLeapYear, februaryNotLeapYear.getDates());
        Assertions.assertNotEquals(februaryDatesLeapYear, februaryNotLeapYear.getDates());
    }
    
    /**
     * Test static get dates leap year.
     */
    @Test
    void testStaticGetDatesLeapYear() {
        Assertions.assertEquals(februaryDatesLeapYear, February.getDates(LEAP_YEAR));
        Assertions.assertNotEquals(februaryDatesNotLeapYear, February.getDates(LEAP_YEAR));
    }
    
    /**
     * Test static get dates not leap year.
     */
    @Test
    void testStaticGetDatesNotLeapYear() {
        Assertions.assertEquals(februaryDatesNotLeapYear, February.getDates(NOT_LEAP_YEAR));
        Assertions.assertNotEquals(februaryDatesLeapYear, February.getDates(NOT_LEAP_YEAR));
    }
    
    /**
     * Test set local date.
     */
    @Test
    void testSetLocalDate() {
        LocalDate expected = LocalDate.of(2025, Month.FEBRUARY, 2);
        
        februaryLeapYear.setLocalDate(LocalDate.of(2025, Month.FEBRUARY, 2));
        
        Assertions.assertEquals(expected, februaryLeapYear.getLocalDate());
    }
}