package org.geekcodes.calendar.models.month;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * The type March.
 */
public class March extends AMonth implements IMonth {
    
    /**
     * Instantiates a new March.
     *
     * @param year the year
     */
    public March(int year) {
        this();
        this.localDate = LocalDate.of(year, java.time.Month.MARCH, 1);
    }
    
    /**
     * Instantiates a new March.
     */
    private March() {
        super(java.time.Month.MARCH);
    }
    
    /**
     * Get holidays list.
     *
     * @param year the year
     *
     * @return the list
     */
    public static List<LocalDate> getHolidays(int year) {
        return new March(year).getHolidays();
    }
    
    /**
     * Get dates list.
     *
     * @param year the year
     *
     * @return the list
     */
    public static List<LocalDate> getDates(int year) {
        return new March(year).getDates();
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
