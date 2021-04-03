package org.geekcodes.calendar.utilities;


import org.junit.jupiter.api.*;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

/**
 * The type Local date utility test.
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class LocalDateUtilityTest {
    private LocalDate localDate = LocalDate.of(2020, Month.JANUARY, 1);
    
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
     * Get days until previous sunday.
     */
    @Test
    @Order(8)
    void getDaysUntilPreviousSunday() {
        LocalDate ld = localDate.plusDays(6); // Add 6 days (Wednesday, 1/1/2020 -> next Tuesday 1/7/2020.
        Assertions.assertEquals(2, LocalDateUtility.getDaysUntilPreviousSunday(ld));
    }
    
    /**
     * Get days until previous monday.
     */
    @Test
    @Order(9)
    void getDaysUntilPreviousMonday() {
        LocalDate ld = localDate.plusDays(6); // Add 6 days (Wednesday, 1/1/2020 -> next Tuesday 1/7/2020.
        Assertions.assertEquals(1, LocalDateUtility.getDaysUntilPreviousMonday(ld));
    }
    
    /**
     * Get days until previous tuesday.
     */
    @Test
    @Order(10)
    void getDaysUntilPreviousTuesday() {
        LocalDate ld = localDate.plusDays(6); // Add 6 days (Wednesday, 1/1/2020 -> next Tuesday 1/7/2020.
        Assertions.assertEquals(0, LocalDateUtility.getDaysUntilPreviousTuesday(ld));
    }
    
    /**
     * Get days until previous wednesday.
     */
    @Test
    @Order(11)
    void getDaysUntilPreviousWednesday() {
        LocalDate ld = localDate.plusDays(6); // Add 6 days (Wednesday, 1/1/2020 -> next Tuesday 1/7/2020.
        Assertions.assertEquals(6, LocalDateUtility.getDaysUntilPreviousWednesday(ld));
    }
    
    /**
     * Get days until previous thursday.
     */
    @Test
    @Order(12)
    void getDaysUntilPreviousThursday() {
        LocalDate ld = localDate.plusDays(6); // Add 6 days (Wednesday, 1/1/2020 -> next Tuesday 1/7/2020.
        Assertions.assertEquals(5, LocalDateUtility.getDaysUntilPreviousThursday(ld));
    }
    
    /**
     * Get days until previous friday.
     */
    @Test
    @Order(13)
    void getDaysUntilPreviousFriday() {
        LocalDate ld = localDate.plusDays(6); // Add 6 days (Wednesday, 1/1/2020 -> next Tuesday 1/7/2020.
        Assertions.assertEquals(4, LocalDateUtility.getDaysUntilPreviousFriday(ld));
    }
    
    /**
     * Get days until previous saturday.
     */
    @Test
    @Order(14)
    void getDaysUntilPreviousSaturday() {
        LocalDate ld = localDate.plusDays(6); // Add 6 days (Wednesday, 1/1/2020 -> next Tuesday 1/7/2020.
        Assertions.assertEquals(3, LocalDateUtility.getDaysUntilPreviousSaturday(ld));
    }


    /**
     * Gets days until target day of week.
     */
    @Test
    void getDaysUntil() {
        Assertions.assertEquals(DayOfWeek.WEDNESDAY, this.localDate.getDayOfWeek());
        Assertions.assertEquals(6, LocalDateUtility.getDaysUntil(localDate, DayOfWeek.TUESDAY));
        Assertions.assertEquals(1, LocalDateUtility.getDaysUntil(localDate, DayOfWeek.THURSDAY));
    }
}