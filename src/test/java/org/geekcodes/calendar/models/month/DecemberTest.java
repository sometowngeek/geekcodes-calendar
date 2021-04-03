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

class DecemberTest {

    private static final int YEAR = 2020;
    private List<LocalDate> decemberDates;
    private List<LocalDate> decemberHolidays;
    private December december;

    /**
     * Get dates list.
     *
     * @return the list
     */
    static List<LocalDate> getDates() {
        List<LocalDate> dates = new ArrayList<>();
        dates.add(LocalDate.of(YEAR, Month.DECEMBER, 1));
        dates.add(LocalDate.of(YEAR, Month.DECEMBER, 2));
        dates.add(LocalDate.of(YEAR, Month.DECEMBER, 3));
        dates.add(LocalDate.of(YEAR, Month.DECEMBER, 4));
        dates.add(LocalDate.of(YEAR, Month.DECEMBER, 5));
        dates.add(LocalDate.of(YEAR, Month.DECEMBER, 6));
        dates.add(LocalDate.of(YEAR, Month.DECEMBER, 7));
        dates.add(LocalDate.of(YEAR, Month.DECEMBER, 8));
        dates.add(LocalDate.of(YEAR, Month.DECEMBER, 9));
        dates.add(LocalDate.of(YEAR, Month.DECEMBER, 10));
        dates.add(LocalDate.of(YEAR, Month.DECEMBER, 11));
        dates.add(LocalDate.of(YEAR, Month.DECEMBER, 12));
        dates.add(LocalDate.of(YEAR, Month.DECEMBER, 13));
        dates.add(LocalDate.of(YEAR, Month.DECEMBER, 14));
        dates.add(LocalDate.of(YEAR, Month.DECEMBER, 15));
        dates.add(LocalDate.of(YEAR, Month.DECEMBER, 16));
        dates.add(LocalDate.of(YEAR, Month.DECEMBER, 17));
        dates.add(LocalDate.of(YEAR, Month.DECEMBER, 18));
        dates.add(LocalDate.of(YEAR, Month.DECEMBER, 19));
        dates.add(LocalDate.of(YEAR, Month.DECEMBER, 20));
        dates.add(LocalDate.of(YEAR, Month.DECEMBER, 21));
        dates.add(LocalDate.of(YEAR, Month.DECEMBER, 22));
        dates.add(LocalDate.of(YEAR, Month.DECEMBER, 23));
        dates.add(LocalDate.of(YEAR, Month.DECEMBER, 24));
        dates.add(LocalDate.of(YEAR, Month.DECEMBER, 25));
        dates.add(LocalDate.of(YEAR, Month.DECEMBER, 26));
        dates.add(LocalDate.of(YEAR, Month.DECEMBER, 27));
        dates.add(LocalDate.of(YEAR, Month.DECEMBER, 28));
        dates.add(LocalDate.of(YEAR, Month.DECEMBER, 29));
        dates.add(LocalDate.of(YEAR, Month.DECEMBER, 30));
        dates.add(LocalDate.of(YEAR, Month.DECEMBER, 31));

        return dates;
    }

    /**
     * Sets up.
     */
    @BeforeEach
    void setUp() {
        december = new December(YEAR);
        decemberDates = DecemberTest.getDates();
        decemberHolidays = DecemberTest.getHolidays();
    }

    /**
     * Gets holidays.
     *
     * @return the holidays
     */
    public static List<LocalDate> getHolidays() {
        List<LocalDate> holidays = new ArrayList<>();
        holidays.add(LocalDate.of(YEAR, Month.DECEMBER, 25));
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
        Assertions.assertEquals(decemberHolidays, december.getHolidays());
    }

    /**
     * Test get holidays static.
     */
    @Test
    void testGetHolidaysStatic() {
        Assertions.assertEquals(decemberHolidays, December.getHolidays(YEAR));
    }

    /**
     * Test get dates.
     */
    @Test
    void testGetDates() {
        Assertions.assertEquals(decemberDates, december.getDates());
    }

    /**
     * Test static get dates.
     */
    @Test
    void testStaticGetDates() {
        Assertions.assertEquals(decemberDates, December.getDates(YEAR));
    }


    /**
     * Test set local date.
     */
    @Test
    void testSetLocalDate() {
        LocalDate expected = LocalDate.of(2025, Month.DECEMBER, 30);

        december.setLocalDate(LocalDate.of(2025, Month.DECEMBER, 30));

        Assertions.assertEquals(expected, december.getLocalDate());
    }

    @Test
    void testGetChristmas() {
        LocalDate expectedDate = LocalDate.of(YEAR, Month.DECEMBER, 25);
        Assertions.assertEquals(expectedDate, december.getChristmas());
    }

    @Test
    void testGetChristmasStatic() {
        LocalDate expectedDate = LocalDate.of(2001, Month.DECEMBER, 25);
        Assertions.assertEquals(expectedDate, December.getChristmas(2001));
    }
}