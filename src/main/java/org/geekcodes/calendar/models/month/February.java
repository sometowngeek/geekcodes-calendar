package org.geekcodes.calendar.models.month;

import org.geekcodes.calendar.utilities.LocalDateUtility;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * The type February.
 */
public class February extends AMonth implements IMonth {
    
    /**
     * Instantiates a new February.
     *
     * @param year the year
     */
    public February(int year) {
        this();
        this.localDate = LocalDate.of(year, java.time.Month.FEBRUARY, 1);
    }
    
    /**
     * Instantiates a new February.
     */
    private February() {
        super(java.time.Month.FEBRUARY);
    }
    
    /**
     * Get holidays list.
     *
     * @param year the year
     *
     * @return the list
     */
    public static List<LocalDate> getHolidays(int year) {
        February february = new February(year);
        
        return february.getHolidays();
    }
    
    /**
     * Get dates list.
     *
     * @param year the year
     *
     * @return the list
     */
    public static List<LocalDate> getDates(int year) {
        February february = new February(year);
        return february.getDates();
    }
    
    /**
     * Gets holidays.
     *
     * @return the holidays
     */
    @Override
    public List<LocalDate> getHolidays() {
        List<LocalDate> holidays = new ArrayList<>();
        
        holidays.add(getPresidentsDay());
        
        return holidays;
    }
    
    /**
     * Gets presidents day.
     *
     * @return the presidents day
     */
    public LocalDate getPresidentsDay() {
        long daysToAdd = LocalDateUtility.getDaysUntil(this.localDate, DayOfWeek.MONDAY);
        return this.localDate.plusDays(daysToAdd + 14);
    }
    
}
