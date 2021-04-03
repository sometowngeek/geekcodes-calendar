package org.geekcodes.calendar.models.month;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * The type April.
 */
public final class April extends AMonth implements IMonth {
    
    /**
     * Instantiates a new April.
     *
     * @param year the year
     */
    public April(int year) {
        this();
        this.localDate = LocalDate.of(year, java.time.Month.APRIL, 1);
    }
    
    /**
     * Instantiates a new April.
     */
    private April() {
        super(java.time.Month.APRIL);
    }
    
    /**
     * Get dates list.
     *
     * @param year the year
     *
     * @return the list
     */
    public static List<LocalDate> getDates(int year) {
        return new April(year).getDates();
    }
    
    /**
     * Get holidays list.
     *
     * @param year the year
     *
     * @return the list
     */
    public static List<LocalDate> getHolidays(int year) {
        return new April(year).getHolidays();
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
}
