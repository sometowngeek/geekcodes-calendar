package org.geekcodes.calendar.models.month;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

class NovemberTest {

    private static final int YEAR = 2020;
    private List<LocalDate> novemberDates;
    private List<LocalDate> novemberHolidays;
    private November november;

    /**
     * Get dates list.
     *
     * @return the list
     */
    static List<LocalDate> getDates() {
        List<LocalDate> dates = new ArrayList<>();
        dates.add(LocalDate.of(YEAR, Month.NOVEMBER, 1));
        dates.add(LocalDate.of(YEAR, Month.NOVEMBER, 2));
        dates.add(LocalDate.of(YEAR, Month.NOVEMBER, 3));
        dates.add(LocalDate.of(YEAR, Month.NOVEMBER, 4));
        dates.add(LocalDate.of(YEAR, Month.NOVEMBER, 5));
        dates.add(LocalDate.of(YEAR, Month.NOVEMBER, 6));
        dates.add(LocalDate.of(YEAR, Month.NOVEMBER, 7));
        dates.add(LocalDate.of(YEAR, Month.NOVEMBER, 8));
        dates.add(LocalDate.of(YEAR, Month.NOVEMBER, 9));
        dates.add(LocalDate.of(YEAR, Month.NOVEMBER, 10));
        dates.add(LocalDate.of(YEAR, Month.NOVEMBER, 11));
        dates.add(LocalDate.of(YEAR, Month.NOVEMBER, 12));
        dates.add(LocalDate.of(YEAR, Month.NOVEMBER, 13));
        dates.add(LocalDate.of(YEAR, Month.NOVEMBER, 14));
        dates.add(LocalDate.of(YEAR, Month.NOVEMBER, 15));
        dates.add(LocalDate.of(YEAR, Month.NOVEMBER, 16));
        dates.add(LocalDate.of(YEAR, Month.NOVEMBER, 17));
        dates.add(LocalDate.of(YEAR, Month.NOVEMBER, 18));
        dates.add(LocalDate.of(YEAR, Month.NOVEMBER, 19));
        dates.add(LocalDate.of(YEAR, Month.NOVEMBER, 20));
        dates.add(LocalDate.of(YEAR, Month.NOVEMBER, 21));
        dates.add(LocalDate.of(YEAR, Month.NOVEMBER, 22));
        dates.add(LocalDate.of(YEAR, Month.NOVEMBER, 23));
        dates.add(LocalDate.of(YEAR, Month.NOVEMBER, 24));
        dates.add(LocalDate.of(YEAR, Month.NOVEMBER, 25));
        dates.add(LocalDate.of(YEAR, Month.NOVEMBER, 26));
        dates.add(LocalDate.of(YEAR, Month.NOVEMBER, 27));
        dates.add(LocalDate.of(YEAR, Month.NOVEMBER, 28));
        dates.add(LocalDate.of(YEAR, Month.NOVEMBER, 29));
        dates.add(LocalDate.of(YEAR, Month.NOVEMBER, 30));

        return dates;
    }

    /**
     * Sets up.
     */
    @BeforeEach
    void setUp() {
        november = new November(YEAR);
        novemberDates = NovemberTest.getDates();
        novemberHolidays = NovemberTest.getHolidays();
    }

    /**
     * Gets holidays.
     *
     * @return the holidays
     */
    public static List<LocalDate> getHolidays() {
        List<LocalDate> holidays = new ArrayList<>();
        holidays.add(LocalDate.of(YEAR, Month.NOVEMBER, 26));
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
        Assertions.assertEquals(novemberHolidays, november.getHolidays());
    }

    /**
     * Test get holidays static.
     */
    @Test
    void testGetHolidaysStatic() {
        Assertions.assertEquals(novemberHolidays, November.getHolidays(YEAR));
    }

    /**
     * Test get dates.
     */
    @Test
    void testGetDates() {
        Assertions.assertEquals(novemberDates, november.getDates());
    }

    /**
     * Test static get dates.
     */
    @Test
    void testStaticGetDates() {
        Assertions.assertEquals(novemberDates, November.getDates(YEAR));
    }


    /**
     * Test set local date.
     */
    @Test
    void testSetLocalDate() {
        LocalDate expected = LocalDate.of(2025, Month.NOVEMBER, 30);

        november.setLocalDate(LocalDate.of(2025, Month.NOVEMBER, 30));

        Assertions.assertEquals(expected, november.getLocalDate());
    }

    @Test
    void testGetThanksgiving() {
        LocalDate thanksgiving = LocalDate.of(2020, Month.NOVEMBER, 26);
        Assertions.assertEquals(thanksgiving, november.getThanksgiving());
    }

    @Test
    void testGetThanksgivingStatic(){
        LocalDate thanksgiving = LocalDate.of(2020, Month.NOVEMBER, 26);
        Assertions.assertEquals(thanksgiving, November.getThanksgiving(YEAR));
    }

}