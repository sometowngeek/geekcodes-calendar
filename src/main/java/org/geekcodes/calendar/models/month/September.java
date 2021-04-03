package org.geekcodes.calendar.models.month;

import org.geekcodes.calendar.utilities.LocalDateUtility;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

/**
 * The type September.
 */
public final class September extends AMonth implements IMonth {
    private September() {
        super(Month.SEPTEMBER);
    }
    
    /**
     * Instantiates a new September.
     *
     * @param year the year
     */
    public September(int year){
        this();
        this.localDate = LocalDate.of(year, Month.SEPTEMBER, 1);
    }
    
    
    /**
     * Get dates list.
     *
     * @param year the year
     *
     * @return the list
     */
    public static List<LocalDate> getDates(int year){
        return new September(year).getDates();
    }
    
    /**
     * Gets holidays.
     *
     * @return the holidays
     */
    @Override
    public List<LocalDate> getHolidays() {
        List<LocalDate> holidays = new ArrayList<>();
        holidays.add(getLaborDay());
        
        return holidays;
    }
    
    /**
     * Get holidays list.
     *
     * @param year the year
     *
     * @return the list
     */
    public static List<LocalDate> getHolidays(int year){
        return new September(year).getHolidays();
    }
    
    /**
     * Get labor day local date.
     *
     * @return the local date
     */
    public LocalDate getLaborDay(){
        LocalDate ld = LocalDate.from(this.localDate);
    
        long daysToAdd = LocalDateUtility.getDaysUntil(this.localDate, DayOfWeek.MONDAY);
        return ld.plusDays(daysToAdd);
    }
    
    /**
     * Get labor day local date.
     *
     * @param year the year
     *
     * @return the local date
     */
    public static LocalDate getLaborDay(int year){
        return new September(year).getLaborDay();
    }
}
