package org.geekcodes.calendar.models.month;

import org.geekcodes.calendar.utilities.LocalDateUtility;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

/**
 * The type May.
 */
public class May extends AMonth implements IMonth {
    private May() {
        super(Month.MAY);
    }
    
    /**
     * Instantiates a new May.
     *
     * @param year the year
     */
    public May(int year) {
        this();
        this.localDate = LocalDate.of(year, Month.MAY, 1);
    }
    
    /**
     * Get memorial day local date.
     *
     * @param year the year
     *
     * @return the local date
     */
    public static LocalDate getMemorialDay(int year) {
        return new May(year).getMemorialDay();
    }
    
    /**
     * Get holidays list.
     *
     * @param year the year
     *
     * @return the list
     */
    public static List<LocalDate> getHolidays(int year) {
        return new May(year).getHolidays();
    }
    
    /**
     * Get memorial day local date.
     *
     * @return the local date
     */
    public LocalDate getMemorialDay() {
        return LocalDateUtility.getLastDay(this.localDate, DayOfWeek.MONDAY);
    }
    
    /**
     * Gets holidays.
     *
     * @return the holidays
     */
    @Override
    public List<LocalDate> getHolidays() {
        List<LocalDate> holidays = new ArrayList<>();
        holidays.add(this.getMemorialDay());
        
        return holidays;
    }
}
