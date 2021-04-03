package org.geekcodes.calendar.models.month;

import org.geekcodes.calendar.utilities.LocalDateUtility;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * The type January.
 */
public final class January extends AMonth implements IMonth {
    
    /**
     * Instantiates a new January.
     *
     * @param year the year
     */
    public January(int year) {
        this();
        this.localDate = LocalDate.of(year, java.time.Month.JANUARY, 1);
    }
    
    /**
     * Instantiates a new January.
     */
    private January() {
        super(java.time.Month.JANUARY);
    }
    
    /**
     * Get dates list.
     *
     * @param year the year
     *
     * @return the list
     */
    public static List<LocalDate> getDates(int year) {
        return new January(year).getDates();
    }
    
    /**
     * Get holidays list.
     *
     * @param year the year
     *
     * @return the list
     */
    public static List<LocalDate> getHolidays(int year) {
        return new January(year).getHolidays();
    }
    
    /**
     * Gets martin luther king jr date.
     *
     * @param year the year
     *
     * @return the martin luther king jr date
     */
    public static LocalDate getMartinLutherKingJrDate(int year) {
        return new January(year).getMartinLutherKingJrDate();
    }
    
    /**
     * Gets new year date.
     *
     * @param year the year
     *
     * @return the new year date
     */
    public static LocalDate getNewYearDate(int year) {
        return new January(year).getNewYearDate();
    }
    
    /**
     * Gets holidays.
     *
     * @return the holidays
     */
    @Override
    public List<LocalDate> getHolidays() {
        List<LocalDate> holidays = new ArrayList<>();
        
        holidays.add(getNewYearDate());
        holidays.add(getMartinLutherKingJrDate());
        
        return holidays;
    }
    
    /**
     * Gets Martin Luther King Jr Date.<br>
     * <em>3rd Monday of January.</em>
     *
     * @return LocalDate the date of MLK Jr day.
     */
    public LocalDate getMartinLutherKingJrDate() {
        long days = LocalDateUtility.getDaysUntil(this.localDate, DayOfWeek.MONDAY);
        return this.localDate.plusDays(days + 14);
    }
    
    /**
     * Gets new year date.
     *
     * @return the new year date
     */
    public LocalDate getNewYearDate() {
        return LocalDate.of(localDate.getYear(), 1, 1);
    }
}
