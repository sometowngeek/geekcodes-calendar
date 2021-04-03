package org.geekcodes.calendar.models.month;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

/**
 * The type August.
 */
public class August extends AMonth implements IMonth {
    private August() {
        super(Month.AUGUST);
    }
    
    /**
     * Instantiates a new August.
     *
     * @param year the year
     */
    public August(int year) {
        this();
        this.localDate = LocalDate.of(year, Month.AUGUST, 1);
    }
    
    /**
     * Gets holidays.
     *
     * @return the holidays
     */
    @Override
    public List<LocalDate> getHolidays() {
        return new ArrayList<>();
    }
    
    /**
     * Get holidays list.
     *
     * @param year the year
     *
     * @return the list
     */
    public static List<LocalDate> getHolidays(int year){
        return new August(year).getHolidays();
    }
    
    /**
     * Get dates list.
     *
     * @param year the year
     *
     * @return the list
     */
    public static List<LocalDate> getDates(int year){
        return new August(year).getDates();
    }
    
    
}
