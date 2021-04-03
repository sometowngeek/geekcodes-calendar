package org.geekcodes.calendar.models.month;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class June extends AMonth implements IMonth {
    private June() {
        super(Month.JUNE);
    }
    
    public June(int year) {
        this();
        this.localDate = LocalDate.of(year, Month.JUNE, 1);
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
        return new June(year).getHolidays();
    }
    
    /**
     * Get dates list.
     *
     * @param year the year
     *
     * @return the list
     */
    public static List<LocalDate> getDates(int year){
        return new June(year).getDates();
    }
}
