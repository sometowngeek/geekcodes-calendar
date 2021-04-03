package org.geekcodes.calendar.models.month;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

class JulyTest {
    
    private static final int             YEAR = 2020;
    private              List<LocalDate> julyDates;
    private              List<LocalDate> julyHolidays;
    private              List<LocalDate> julyObservedHolidays;
    private              July            july;
    
    /**
     * Get dates list.
     *
     * @return the list
     */
    static List<LocalDate> getDates() {
        List<LocalDate> dates = new ArrayList<>();
        dates.add(LocalDate.of(YEAR, Month.JULY, 1));
        dates.add(LocalDate.of(YEAR, Month.JULY, 2));
        dates.add(LocalDate.of(YEAR, Month.JULY, 3));
        dates.add(LocalDate.of(YEAR, Month.JULY, 4));
        dates.add(LocalDate.of(YEAR, Month.JULY, 5));
        dates.add(LocalDate.of(YEAR, Month.JULY, 6));
        dates.add(LocalDate.of(YEAR, Month.JULY, 7));
        dates.add(LocalDate.of(YEAR, Month.JULY, 8));
        dates.add(LocalDate.of(YEAR, Month.JULY, 9));
        dates.add(LocalDate.of(YEAR, Month.JULY, 10));
        dates.add(LocalDate.of(YEAR, Month.JULY, 11));
        dates.add(LocalDate.of(YEAR, Month.JULY, 12));
        dates.add(LocalDate.of(YEAR, Month.JULY, 13));
        dates.add(LocalDate.of(YEAR, Month.JULY, 14));
        dates.add(LocalDate.of(YEAR, Month.JULY, 15));
        dates.add(LocalDate.of(YEAR, Month.JULY, 16));
        dates.add(LocalDate.of(YEAR, Month.JULY, 17));
        dates.add(LocalDate.of(YEAR, Month.JULY, 18));
        dates.add(LocalDate.of(YEAR, Month.JULY, 19));
        dates.add(LocalDate.of(YEAR, Month.JULY, 20));
        dates.add(LocalDate.of(YEAR, Month.JULY, 21));
        dates.add(LocalDate.of(YEAR, Month.JULY, 22));
        dates.add(LocalDate.of(YEAR, Month.JULY, 23));
        dates.add(LocalDate.of(YEAR, Month.JULY, 24));
        dates.add(LocalDate.of(YEAR, Month.JULY, 25));
        dates.add(LocalDate.of(YEAR, Month.JULY, 26));
        dates.add(LocalDate.of(YEAR, Month.JULY, 27));
        dates.add(LocalDate.of(YEAR, Month.JULY, 28));
        dates.add(LocalDate.of(YEAR, Month.JULY, 29));
        dates.add(LocalDate.of(YEAR, Month.JULY, 30));
        dates.add(LocalDate.of(YEAR, Month.JULY, 31));
        
        return dates;
    }
    
    static List<LocalDate> getHolidays() {
        List<LocalDate> holidays = new ArrayList<>();
        holidays.add(LocalDate.of(YEAR, Month.JULY, 4));
        return holidays;
    }
    
    static List<LocalDate> getHolidaysObserved() {
        List<LocalDate> holidays = new ArrayList<>();
        holidays.add(LocalDate.of(YEAR, Month.JULY, 3));
        return holidays;
    }
    
    @BeforeEach
    void setUp() {
        this.july                 = new July(YEAR);
        this.julyDates            = JulyTest.getDates();
        this.julyHolidays         = JulyTest.getHolidays();
        this.julyObservedHolidays = JulyTest.getHolidaysObserved();
    }
    
    @AfterEach
    void tearDown() {
    }
    
    @Test
    void testGetDates() {
        Assertions.assertEquals(julyDates, july.getDates());
    }
    
    @Test
    void testGetDatesStatic() {
        Assertions.assertEquals(julyDates, July.getDates(YEAR));
    }
    
    @Test
    void testSetLocalDate() {
        Assertions.assertDoesNotThrow(() -> july.setLocalDate(LocalDate.of(YEAR, Month.JULY, 5)));
    }
    
    @Test
    void testGetFourthOfJuly() {
        LocalDate expectedDate = LocalDate.of(YEAR, Month.JULY, 4);
        Assertions.assertEquals(expectedDate, july.getFourthOfJuly());
    }
    
    @Test
    void testGetFourthOfJulyStatic() {
        LocalDate expectedDate = LocalDate.of(YEAR, Month.JULY, 4);
        Assertions.assertEquals(expectedDate, July.getFourthOfJuly(YEAR));
    }
    
    @Test
    void testGetFourthOfJulyObserved() {
        LocalDate expectedDateSaturday = LocalDate.of(YEAR, Month.JULY, 3);
        Assertions.assertEquals(expectedDateSaturday, july.getFourthOfJulyObserved());
    
        this.july = new July(2021);
        LocalDate expectedDateSunday = LocalDate.of(2021, Month.JULY, 5);
        Assertions.assertEquals(expectedDateSunday, july.getFourthOfJulyObserved());
    
        this.july = new July(2022);
        LocalDate expectedDateMonday = LocalDate.of(2022, Month.JULY, 4);
        Assertions.assertEquals(expectedDateMonday, july.getFourthOfJulyObserved());
    }
    
    @Test
    void testGetFourthOfJulyObservedStatic() {
        LocalDate expectedDateSaturday = LocalDate.of(YEAR, Month.JULY, 3);
        Assertions.assertEquals(expectedDateSaturday, July.getFourthOfJulyObserved(YEAR));
    
        LocalDate expectedDateMonday = LocalDate.of(2021, Month.JULY, 5);
        Assertions.assertEquals(expectedDateMonday, July.getFourthOfJulyObserved(2021));
    
        LocalDate expectedDateSunday = LocalDate.of(2022, Month.JULY, 4);
        Assertions.assertEquals(expectedDateSunday, July.getFourthOfJulyObserved(2022));
    }
    
    @Test
    void testGetHolidays() {
        Assertions.assertEquals(julyHolidays, july.getHolidays());
    }
    
    @Test
    void testGetHolidaysStatic() {
        Assertions.assertEquals(julyHolidays, July.getHolidays(YEAR));
    }
    
    @Test
    void testGetObservedHolidays() {
        Assertions.assertEquals(julyObservedHolidays, july.getObservedHolidays());
    }
    
    @Test
    void testGetObservedHolidaysStatic() {
        Assertions.assertEquals(julyObservedHolidays, July.getObservedHolidays(YEAR));
    }
}