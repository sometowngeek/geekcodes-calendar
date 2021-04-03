package org.geekcodes.calendar.utilities;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * The type Calendar utility.
 */
public class LocalDateUtility {
    private LocalDateUtility() {
    }
    
    /**
     * Get days until previous sunday int.
     *
     * @param localDate the local date
     *
     * @return the int
     */
    public static long getDaysUntilPreviousSunday(LocalDate localDate) {
        return getDaysUntilPreviousX(localDate, DayOfWeek.SUNDAY);
    }
    
    /**
     * Get days until previous saturday int.
     *
     * @param localDate the local date
     *
     * @return the int
     */
    public static long getDaysUntilPreviousSaturday(LocalDate localDate) {
        return getDaysUntilPreviousX(localDate, DayOfWeek.SATURDAY);
    }
    
    /**
     * Get days until previous monday int.
     *
     * @param localDate the local date
     *
     * @return the int
     */
    public static long getDaysUntilPreviousMonday(LocalDate localDate) {
        return getDaysUntilPreviousX(localDate, DayOfWeek.MONDAY);
    }
    
    /**
     * Get days until previous tuesday int.
     *
     * @param localDate the local date
     *
     * @return the int
     */
    public static long getDaysUntilPreviousTuesday(LocalDate localDate) {
        return getDaysUntilPreviousX(localDate, DayOfWeek.TUESDAY);
    }
    
    /**
     * Get days until previous wednesday int.
     *
     * @param localDate the local date
     *
     * @return the int
     */
    public static long getDaysUntilPreviousWednesday(LocalDate localDate) {
        return getDaysUntilPreviousX(localDate, DayOfWeek.WEDNESDAY);
    }
    
    /**
     * Get days until previous thursday int.
     *
     * @param localDate the local date
     *
     * @return the int
     */
    public static long getDaysUntilPreviousThursday(LocalDate localDate) {
        return getDaysUntilPreviousX(localDate, DayOfWeek.THURSDAY);
    }
    
    /**
     * Get days until previous friday int.
     *
     * @param localDate the local date
     *
     * @return the int
     */
    public static long getDaysUntilPreviousFriday(LocalDate localDate) {
        return getDaysUntilPreviousX(localDate, DayOfWeek.FRIDAY);
    }
    
    /**
     * Get count of days until previous X (day).
     *
     * @param localDate       the local date.
     * @param targetDayOfWeek target day of week.
     *
     * @return count of days until previous X (day).
     */
    private static long getDaysUntilPreviousX(LocalDate localDate, DayOfWeek targetDayOfWeek) {
        final DayOfWeek calendarDayOfWeek = localDate.getDayOfWeek();
        
        if (calendarDayOfWeek.getValue() >= targetDayOfWeek.getValue()) {
            return (long) calendarDayOfWeek.getValue() - targetDayOfWeek.getValue();
        }
        
        // Return 7 days minus the difference of calendarDayOfWeek from targetDayOfWeek.
        // Days are 1-7, Monday-Sunday, respectively.
        return 7 - ((long) targetDayOfWeek.getValue() - calendarDayOfWeek.getValue());
    }
    
    
    /**
     * Gets days until X date.
     *
     * @param localDate       the local date
     * @param targetDayOfWeek the target day of week.
     *
     * @return the days until saturday
     */
    public static long getDaysUntil(LocalDate localDate, DayOfWeek targetDayOfWeek) {
        final DayOfWeek calendarDayOfWeek = localDate.getDayOfWeek();
        final int       fixed             = 7 + targetDayOfWeek.getValue(); // 7 days of the week
        
        if (calendarDayOfWeek.getValue() < targetDayOfWeek.getValue() + 1) {
            return (long) targetDayOfWeek.getValue() - calendarDayOfWeek.getValue();
        }
    
        return (long) fixed - calendarDayOfWeek.getValue();
    }
    
    /**
     * Get the last {@link java.time.DayOfWeek DayOfWeek}-th date of the month.
     *
     * @param localDate the local date.
     * @param dayOfWeek the target last day of the month.
     *
     * @return the date of the last X day of the month.
     */
    public static LocalDate getLastDay(LocalDate localDate, DayOfWeek dayOfWeek) {
        LocalDate ld = localDate.plusMonths(1).withDayOfMonth(1).minusDays(1);
        
        return ld.minusDays(getDaysUntilPreviousX(ld, dayOfWeek));
    }


}
