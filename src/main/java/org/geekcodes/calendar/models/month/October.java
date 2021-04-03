package org.geekcodes.calendar.models.month;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

/**
 * The type October.
 */
public class October extends AMonth implements IMonth {
    private October(){
        super(Month.OCTOBER);
    }
    
    /**
     * Instantiates a new October.
     *
     * @param year the year
     */
    public October(int year) {
        this();
        this.localDate = LocalDate.of(year, Month.OCTOBER, 1);
    }
    
    /**
     * Get dates list.
     *
     * @param year the year
     *
     * @return the list
     */
    public static List<LocalDate> getDates(int year){
        return new October(year).getDates();
    }
    
    /**
     * Gets holidays.
     *
     * @return the holidays
     */
    @Override
    public List<LocalDate> getHolidays() {
        List<LocalDate> holidays = new ArrayList<>();
        holidays.add(this.getHalloween());
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
        return new October(year).getHolidays();
    }
    
    /**
     * Get halloween local date.
     *
     * @return the local date
     */
    public LocalDate getHalloween(){
        return this.localDate.withDayOfMonth(31);
    }
    
    /**
     * Get halloween local date.
     *
     * @param year the year
     *
     * @return the local date
     */
    public static LocalDate getHalloween(int year){
        return new October(year).getHalloween();
    }
}
